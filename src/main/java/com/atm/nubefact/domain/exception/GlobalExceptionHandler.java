package com.atm.nubefact.domain.exception;

import com.atm.nubefact.api.company.dto.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // Manejo para errores que tú lances usando ResponseStatusException
    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<ErrorResponse> handleResponseStatusException(
            ResponseStatusException ex,
            HttpServletRequest request
    ) {

        ErrorResponse error = new ErrorResponse(
                false,
                ex.getReason(),
                ex.getStatusCode().toString(),
                Instant.now(),
                request.getRequestURI()
        );

        return new ResponseEntity<>(error, ex.getStatusCode());
    }

    // Manejo para cualquier error inesperado
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGenericException(
            Exception ex,
            HttpServletRequest request
    ) {

        ErrorResponse error = new ErrorResponse(
                false,
                "Internal server error",
                "INTERNAL_ERROR",
                Instant.now(),
                request.getRequestURI()
        );

        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
