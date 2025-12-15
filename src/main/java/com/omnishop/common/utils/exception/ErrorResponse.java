package com.omnishop.common.utils.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ErrorResponse {
    private LocalDateTime timestamp;
    private String code;     // USR-404
    private String message;  // Usuario no encontrado
    private String path;     // /api/users/1
    private int status;      // 404
}
