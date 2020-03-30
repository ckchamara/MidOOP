package com.company.users;

public class Artist extends User {

    private int noOfSongs;
    private String gerne;

    public Artist(User user, String name, String email, int noOfSongs, String gerne) {
        super(user, name, email);
        this.noOfSongs = noOfSongs;
        this.gerne = gerne;
    }

    public void storeAndPrintSongs() {

    }

    @Override
    public void printDetails() {

    }
}
