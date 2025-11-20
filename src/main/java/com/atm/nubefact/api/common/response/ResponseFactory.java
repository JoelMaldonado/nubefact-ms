package com.atm.nubefact.api.common.response;

public class ResponseFactory {

    private ResponseFactory() {
        // Evitar instanciación
    }

    // ========================
    // RESPUESTAS DE ÉXITO
    // ========================

    public static <T> ApiResponse<T> success(String message, T data) {
        return ApiResponse.<T>builder()
                .success(true)
                .message(message)
                .data(data)
                .error(null)
                .build();
    }

    public static ApiResponse<Void> success(String message) {
        return ApiResponse.<Void>builder()
                .success(true)
                .message(message)
                .data(null)
                .error(null)
                .build();
    }

    public static <T> ApiResponse<T> success(T data) {
        return ApiResponse.<T>builder()
                .success(true)
                .message(null)
                .data(data)
                .error(null)
                .build();
    }

    // ========================
    // RESPUESTAS DE ERROR
    // ========================

    public static <T> ApiResponse<T> error(String code, String message, String details) {
        return ApiResponse.<T>builder()
                .success(false)
                .message(message)
                .data(null)
                .error(ApiError.builder()
                        .code(code)
                        .details(details)
                        .build())
                .build();
    }

    public static <T> ApiResponse<T> error(String code, String message) {
        return error(code, message, null);
    }

    public static <T> ApiResponse<T> error(String code, Throwable ex) {
        return error(code, ex.getMessage(), null);
    }
}