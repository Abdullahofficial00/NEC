package com.example.application.models;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public final class JwtRequest {
    private PasswordEncoder passwordEncoder;
    @Email
    private String email;
    @NotBlank
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
//    private String hashPassword(String password) {
//        return passwordEncoder.encode(password);
//    }



}
