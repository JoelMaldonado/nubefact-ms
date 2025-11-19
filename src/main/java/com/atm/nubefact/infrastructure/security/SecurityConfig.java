package com.atm.nubefact.infrastructure.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable()) // desactivar CSRF para APIs
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/**").permitAll() // TODO: aquí luego restringes por API key / JWT
                        .anyRequest().permitAll()              // todo abierto por ahora
                )
                .httpBasic(httpBasic -> {}); // opcional, puedes quitarlo si no usarás basic auth

        return http.build();
    }
}
