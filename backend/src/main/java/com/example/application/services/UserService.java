package com.example.application.services;
import com.example.application.dto.AccountDto;
import com.example.application.entities.*;
public interface UserService {
    AccountDto createUser(AccountDto account);
    Account findAccountById(Integer id);
    Account findAccountByEmail(String email);
    Account findAccountByPhoneNumber(String number);
}
