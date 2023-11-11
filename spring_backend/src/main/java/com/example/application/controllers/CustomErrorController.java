package com.example.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.support.MethodArgumentNotValidException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//imports
@RestController
public class CustomErrorController implements ErrorController {

    public static final String AN_ERROR_OCCURRED_PLEASE_TRY_AGAIN_LATER = "An error occurred. Please try again later.";
    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public ResponseEntity<String> handleError() {
        // Customize the error response as needed
        String principalName = getPrincipalName();
        String errorMessage = AN_ERROR_OCCURRED_PLEASE_TRY_AGAIN_LATER + " (Principal: " + principalName + ")";
        return ResponseEntity.status(500).body(errorMessage);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
        String principalName = getPrincipalName();
        String paramName = ex.getMethodParameter().getParameterName();
        String message = "Invalid parameter value: " + paramName + ". (Principal: " + principalName + ")";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
    }


    private String getPrincipalName() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication != null ? authentication.getName() : "Anonymous";
    }

    @Autowired
    public String getErrorPath() {
        return PATH;
    }
}
