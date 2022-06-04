package com.myresume.api.user.model;

public class LoginRequestModel {

    private String email;
    private String password;

    public LoginRequestModel() {
    }

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
