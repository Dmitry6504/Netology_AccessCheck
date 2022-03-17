package com.company;

public class User {

    String name;
    String login;
    String password;
    String email;
    int age;
    public User(String name, String login, String password, String email, int age) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;

    }
    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
