package com.anup.implementJWT.springBootJWTAuthentication.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Anup Kumar Singh - 2025
 */

@RestController
public class HomeController {
    @GetMapping("/home")
    public String get(){
        return "Ram Ram";
    }
}
