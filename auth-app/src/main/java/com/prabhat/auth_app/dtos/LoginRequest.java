package com.prabhat.auth_app.dtos;

public record LoginRequest(
        String email,
        String password
) {
}
