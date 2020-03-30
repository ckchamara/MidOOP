package com.company.users;

public abstract class User {

    private String name;
    private String email;

//    public User(String name, String email) {
//        this.name = name;
//        this.email = email;
//    }

    public User(User user, String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract void printDetails();
}
