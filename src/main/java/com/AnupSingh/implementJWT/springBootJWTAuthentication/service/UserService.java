package com.anup.implementJWT.springBootJWTAuthentication.service;

import com.anup.implementJWT.springBootJWTAuthentication.dto.req.UserRequestDto;
import com.anup.implementJWT.springBootJWTAuthentication.dto.resp.UserResponseDto;

import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * Created by Anup Kumar Singh - 2025
 */

public interface UserService extends UserDetailsService {
    List<UserResponseDto> getAllUser();
    public UserResponseDto createUser(UserRequestDto userRequestDto);

}
