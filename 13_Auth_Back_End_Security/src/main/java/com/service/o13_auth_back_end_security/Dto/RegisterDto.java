package com.service.o13_auth_back_end_security.Dto;

import lombok.Data;

@Data
public class RegisterDto {
    private String username;
    private String password;
    private String role;
}