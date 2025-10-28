package com.anup.implementJWT.springBootJWTAuthentication.dto.req;

import lombok.*;

/**
 * Created by Anup Kumar Singh - 2025
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtRequest {
    private String email;
    private String password;
	
    public String getEmail() {
		return email;
	}
	
    public void setEmail(String email) {
		this.email = email;
	}
	
    public String getPassword() {
		return password;
	}
	
    public void setPassword(String password) {
		this.password = password;
	}
}
