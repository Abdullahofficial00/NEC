package com.example.application.dto;

import com.example.application.entities.Account;
import jakarta.validation.constraints.*;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Account}
 */
@Value
public class AccountDto implements Serializable {
    @NotNull(message = "ID cannot be null")
    Integer id;
    @NotBlank(message = "First name cannot be blank")
    String firstName;
    @NotBlank(message = "Last name cannot be blank")
    String lastName;
    @NotBlank(message = "Phone number cannot be blank")
    String phoneNumber;
    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Invalid email format")
    String email;
    @NotBlank(message = "Password cannot be blank")
    @Size(min = 6, max = 50, message = "Password must be between 6 and 50 characters")
    String password;
    //password

    @NotNull(message = "Verification status for phone cannot be null")
    Integer isVerifiedPhone;
    @NotNull(message = "Verification status for Email cannot be null")
    Integer isVerifiedEmail;
}