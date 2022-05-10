package com.myresume.api.user.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserModel {

    @NotNull(message = "FirstName can not be null")
    @Size(min = 2, message = "FirstName must be less than two characters")
    private String firstName;

    @NotNull(message = "LastName can not be null")
    @Size(min = 2, message = "LastName must be less than two characters")
    private String lastName;

    @NotNull(message = "Password can not be null")
    @Size(min = 2, max = 16, message = "Password must be equal or grater than 2 characters and less than 16 characters")
    private String password;

    @NotNull(message = "Email can not be null")
    @Email
    private String email;

    public CreateUserModel() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
