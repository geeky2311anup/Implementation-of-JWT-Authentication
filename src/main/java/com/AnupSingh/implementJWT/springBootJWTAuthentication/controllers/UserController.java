package com.anup.implementJWT.springBootJWTAuthentication.controllers;

import com.anup.implementJWT.springBootJWTAuthentication.dto.resp.UserResponseDto;
import com.anup.implementJWT.springBootJWTAuthentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Anup Kumar Singh - 2025
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAllUser(){
        return new ResponseEntity<>( userService.getAllUser(), HttpStatus.OK);
    }

}
