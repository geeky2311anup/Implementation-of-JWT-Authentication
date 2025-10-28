package com.abhinash.implementJWT.springBootJWTAuthentication.repo;

import com.abhinash.implementJWT.springBootJWTAuthentication.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by Anup Kumar Singh - 2025
 */

public interface UserRepo extends JpaRepository<UserEntity,Long> {

    public Optional<UserEntity> findByEmail(String email);

}
