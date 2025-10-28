package com.anup.implementJWT.springBootJWTAuthentication.exp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Created by Anup Kumar Singh - 2025
 */

public class AuthError extends RuntimeException {

    public ResponseEntity<String> AuthError() {
            return new ResponseEntity<>("Access Denied", HttpStatus.FORBIDDEN);
    }

}
