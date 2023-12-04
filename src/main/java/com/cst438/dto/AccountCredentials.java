package com.cst438.dto;

public class AccountCredentials {

    private String username;
    private String password;

    public AccountCredentials(String username, String password) {
        if (username == null || username.length() < 4 || username.length() > 255) {
            throw new IllegalArgumentException("Invalid username");
        }
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Invalid password");
        }
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

// O