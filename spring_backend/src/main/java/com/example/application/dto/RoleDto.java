package com.example.application.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.application.entities.Role}
 */
@Value
public class RoleDto implements Serializable {
    Integer id;
    @NotBlank(message = "Role name cant be blank")
    String name;
}