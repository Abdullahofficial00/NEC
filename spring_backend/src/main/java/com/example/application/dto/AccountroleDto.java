package com.example.application.dto;

import com.example.application.dto.AccountDto;
import com.example.application.dto.RoleDto;
import com.example.application.entities.Accountrole;
import lombok.Value;

import java.io.Serializable;

/**
 */
@Value
public class AccountroleDto implements Serializable {
    Integer id;
    AccountDto account;
    RoleDto role;
}