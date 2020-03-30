package com.company.users;

public class Artist extends User {

    private int noOfSongs;
    private String gerne;
    private User user;

    public Artist(User user, int noOfSongs, String gerne) {
        super(user);
        this.noOfSongs = noOfSongs;
        this.gerne = gerne;
    }

    public void storeAndPrintSongs() {

    }

    @Override
    public void printDetails() {
        System.out.println("name : " + user.name);
        System.out.println("name : " + user.email);
        System.out.println("name : " + this.noOfSongs);
        System.out.println("name : " + this.gerne);
    }
}
