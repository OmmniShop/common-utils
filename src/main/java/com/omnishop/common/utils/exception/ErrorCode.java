package com.omnishop.common.utils.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    USER_NOT_FOUND("USR-404", "Usuario no encontrado", HttpStatus.NOT_FOUND),
    USER_ALREADY_EXISTS("USR-409", "El usuario ya existe", HttpStatus.CONFLICT),
    INVALID_PASSWORD("AUTH-401", "La contraseña es incorrecta", HttpStatus.UNAUTHORIZED),
    AREA_NOT_FOUND("ARE-404", "Área no encontrada", HttpStatus.NOT_FOUND),
    CARGO_NOT_FOUND("CAR-404", "Cargo no encontrado", HttpStatus.NOT_FOUND),
    VALIDATION_ERROR("GEN-400", "Validación fallida", HttpStatus.BAD_REQUEST),
    INTERNAL_ERROR("GEN-500", "Error interno del servidor", HttpStatus.INTERNAL_SERVER_ERROR);

    private final String code;
    private final String message;
    private final HttpStatus status;

    ErrorCode(String code, String message, HttpStatus status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }
}
