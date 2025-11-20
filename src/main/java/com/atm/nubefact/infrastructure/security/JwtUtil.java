package com.atm.nubefact.infrastructure.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;
import java.util.UUID;

@Component
public class JwtUtil {
    private static final String SECRET = "olqCFmT3SNDkCupeGkU66BBrKBWGCzDA";
    private static final Key KEY = Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8));
    private static final String ISSUER = "nubefact-ms";
    private static final String AUDIENCE = "internal-backends";


    public String generateToken(Long clientId, int minutes) {
        Date now = new Date();
        Date exp = new Date(now.getTime() + minutes * 60_000L);
        String jti = UUID.randomUUID().toString();
        return Jwts.builder()
                .setSubject(clientId.toString())
                .setId(jti)
                .setIssuedAt(now)
                .setExpiration(exp)
                .setIssuer(ISSUER)
                .setAudience(AUDIENCE)
                .signWith(KEY, SignatureAlgorithm.HS256)
                .compact();
    }

    public Claims parseToken(String token) throws JwtException {
        return Jwts.parserBuilder()
                .setSigningKey(KEY)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    public boolean isValid(String token) {
        try {
            Claims claims = parseToken(token);
            Date exp = claims.getExpiration();
            return exp == null || exp.after(new Date());
        } catch (JwtException | IllegalArgumentException e) {
            return false;
        }
    }

    public Long getClientId(String token) {
        Claims claims = parseToken(token);
        return Long.valueOf(claims.getSubject());
    }
}
