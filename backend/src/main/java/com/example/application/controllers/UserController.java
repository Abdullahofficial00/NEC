package com.example.application.controllers;

import com.example.application.dto.AccountDto;
import com.example.application.entities.Account;
import com.example.application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<AccountDto> registerUser(@RequestBody AccountDto accountDto) {
        AccountDto createdAccountDto = userService.createUser(accountDto);
        return new ResponseEntity<>(createdAccountDto, HttpStatus.CREATED);
    }

    @GetMapping("/{phoneNumber}")
    public ResponseEntity<Account> getUserById(@PathVariable String phoneNumber) {
        Account account = userService.findAccountByPhoneNumber(phoneNumber);
        if (account == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(account, HttpStatus.OK);
    }


    @GetMapping("/start")
    public String getstart(){
        return"start";
    }








}
