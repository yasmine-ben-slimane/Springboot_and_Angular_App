package com.springboot.springboot_and_angular_app.version_jwt.Auth;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthenticationResponse {
    private String token;
}
