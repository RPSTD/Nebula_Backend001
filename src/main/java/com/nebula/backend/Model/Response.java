package com.nebula.backend.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Map;
@Data
@SuperBuilder
@JsonInclude
public class Response {
    protected LocalDateTime timestamp;
    protected int statusCode;
    protected HttpStatus status;
    protected  String reason;
    protected String message;
    protected String developerMessage;
    protected Map<?,?> data;
}
