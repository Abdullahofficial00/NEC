package com.example.application.controllers;
import com.example.application.dto.AccountDto;
import com.example.application.entities.Account;
import com.example.application.models.JwtRequest;
import com.example.application.models.JwtResponse;
import com.example.application.security.JwtHelper;
import com.example.application.services.JwtService;
import com.example.application.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class Auth_Controller {
    protected static final String INVALID_USERNAME_OR_PASSWORD = " Invalid Username or Password  !!";
    protected static final String CREDENTIALS_INVALID = "Credentials Invalid !!";
    private final UserDetailsService userDetailsService;

    private final  AuthenticationManager manager;

    private final JwtHelper helper;
    private final UserService userService;

    @Autowired
    public Auth_Controller(UserDetailsService userDetailsService,
                                       AuthenticationManager manager,
                                       JwtHelper helper,
                                        UserService userService) {
        this.userDetailsService = userDetailsService;
        this.manager = manager;
        this.helper = helper;
        this.userService=userService;
    }


    private Logger logger = LoggerFactory.getLogger(Auth_Controller.class);


    @PostMapping("/login")
    public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest request) {

        this.doAuthenticate(request.getEmail(), request.getPassword());


        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getEmail());
        String token = this.helper.generateToken(userDetails);

        JwtResponse response = JwtResponse.builder()
                .jwtToken(token)
                .username(userDetails.getUsername()).build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @PostMapping("/signup")
    public ResponseEntity<AccountDto> registerUser(@RequestBody AccountDto accountDto) {
        AccountDto createdAccountDto = userService.createUser(accountDto);
        return new ResponseEntity<>(createdAccountDto, HttpStatus.CREATED);
    }

    private void doAuthenticate(String email, String password) {

        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(email, password);
        try {
            manager.authenticate(authentication);


        } catch (BadCredentialsException e) {
            throw new BadCredentialsException(INVALID_USERNAME_OR_PASSWORD);
        }

    }

    @ExceptionHandler(BadCredentialsException.class)
    public String exceptionHandler() {
        return CREDENTIALS_INVALID;
    }



}
