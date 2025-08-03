package com.service.o13_auth_back_end_security.Controller;


import com.service.o13_auth_back_end_security.Dto.ApiResponse;
import com.service.o13_auth_back_end_security.Dto.AuthDto;
import com.service.o13_auth_back_end_security.Dto.RegisterDto;
import com.service.o13_auth_back_end_security.Service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ThreadPoolExecutor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<ApiResponse> registerUser(@RequestBody RegisterDto registerDto){
        return ResponseEntity.ok(
                new ApiResponse(
                        200,
                        "User Regi tor SuccessFull",
                        authService.register(registerDto)
                )
        );
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse> login(@RequestBody AuthDto authDto){
        return ResponseEntity.ok(
               new  ApiResponse(
                       200,
                       "Ok",
                       authService.authenticate(authDto)
               )
        );
    }


}
