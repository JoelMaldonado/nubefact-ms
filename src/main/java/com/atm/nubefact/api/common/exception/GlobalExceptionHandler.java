package com.atm.nubefact.api.common.exception;

import com.atm.nubefact.api.common.response.ApiError;
import com.atm.nubefact.api.common.response.ApiResponse;
import com.atm.nubefact.infrastructure.exception.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UnauthorizedException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ApiResponse<?> handleUnauthorized(UnauthorizedException ex) {
        return ApiResponse.builder()
                .success(false)
                .message("No autorizado")
                .error(ApiError.builder()
                        .code("UNAUTHORIZED")
                        .details(ex.getMessage())
                        .build())
                .build();
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiResponse<?> handleGeneric(Exception ex) {
        return ApiResponse.builder()
                .success(false)
                .message("Error interno")
                .error(ApiError.builder()
                        .code("INTERNAL_ERROR")
                        .details(ex.getMessage())
                        .build())
                .build();
    }

}
