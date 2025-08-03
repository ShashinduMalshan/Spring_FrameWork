package com.service.o13_auth_back_end_security.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse {
    private int status;
    private String message;
    private Object data;
}