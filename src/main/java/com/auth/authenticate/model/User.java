package com.auth.authenticate.model;

public class User {
    private String email;
    private String password;
    private String fristName;
    private String lastName;

    public User(String email, String password, String fristName, String lastName) {
        this.email = email;
        this.password = password;
        this.fristName = fristName;
        this.lastName = lastName;
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

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
