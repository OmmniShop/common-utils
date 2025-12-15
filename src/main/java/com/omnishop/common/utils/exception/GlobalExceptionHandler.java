package com.omnishop.common.utils.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorResponse> handleOmniException(
            BusinessException ex,
            HttpServletRequest request
    ) {
        ErrorCode code = ex.getErrorCode();

        ErrorResponse response = ErrorResponse.builder()
                .timestamp(LocalDateTime.now())
                .code(code.getCode())
                .message(ex.getMessage())
                .status(code.getStatus().value())
                .path(request.getRequestURI())
                .build();

        return new ResponseEntity<>(response, code.getStatus());
    }
}
