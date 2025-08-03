package com.service.o13_auth_back_end_security.Service;

import com.service.o13_auth_back_end_security.Dto.AuthDto;
import com.service.o13_auth_back_end_security.Dto.AuthResponseDto;
import com.service.o13_auth_back_end_security.Dto.RegisterDto;
import com.service.o13_auth_back_end_security.Entity.Role;
import com.service.o13_auth_back_end_security.Entity.User;
import com.service.o13_auth_back_end_security.Repository.UserRepository;
import com.service.o13_auth_back_end_security.Utill.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public AuthResponseDto authenticate(AuthDto authDTO){

        User user = userRepository.findByUsername(authDTO.getUsername()).orElseThrow(()->new RuntimeException("User not found"));

        if (!passwordEncoder.matches(authDTO.getPassword(),user.getPassword())){
            throw new BadCredentialsException("Invalid credentials");
        }

        String token = jwtUtil.generateToken(authDTO.username);
        return new AuthResponseDto(token);
    }

    public String register(RegisterDto registerDto){
        if (userRepository.findByUsername(registerDto.getUsername()).isPresent()){
            throw new BadCredentialsException("Username already exists");
        }

         User user = User.builder()
                .username(registerDto.getUsername())
                .password(passwordEncoder.encode(registerDto.getPassword()))
                .role(Role.valueOf(registerDto.getRole()))
                .build();
        userRepository.save(user);
        return "User registered successfully";
    }



}