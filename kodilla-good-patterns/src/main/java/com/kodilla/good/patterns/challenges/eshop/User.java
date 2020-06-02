package com.kodilla.good.patterns.challenges.eshop;

public class User {
    private String name;
    private String surname;
    private String login;
    private String password;
    private String email;
    private String address;

    public User (String name, String surname, String email, String address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.login = "";
        this.password = "";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setLogin(String login) {
        if (this.login.equals("")) {
            this.login = login;
        }
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setPassword(String password) {
        if (this.password.equals("")) {
            this.password = password;
        }
    }

    public boolean logIn(String login, String password) {
        if (this.login.equals(login) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}