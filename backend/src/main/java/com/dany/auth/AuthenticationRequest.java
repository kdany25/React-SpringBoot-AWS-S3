package com.dany.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
