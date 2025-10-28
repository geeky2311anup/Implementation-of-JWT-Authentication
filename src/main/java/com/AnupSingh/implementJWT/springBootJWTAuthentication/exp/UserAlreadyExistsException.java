package com.anup.implementJWT.springBootJWTAuthentication.exp;

/**
 * Created by Anup Kumar Singh - 2025
 */

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

