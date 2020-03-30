package com.company.users;

public class Operator extends User {

    private int empNo;
    private String jobTitle;

    public Operator(User user, String name, String email, int empNo, String jobTitle) {
        super(user, name, email);
        this.jobTitle = jobTitle;
        this.empNo = empNo;
    }

    @Override
    public void printDetails() {

    }
}
