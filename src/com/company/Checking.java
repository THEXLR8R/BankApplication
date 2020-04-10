package com.company;

public class Checking  extends Account {

    // list props  specific to a checking acc


    // constructor to initialize checking acc  properties
    public Checking(String name) {
        super(name);
        System.out.println("New Checking Account!");
        System.out.println("Name is : " + name);
    }


    // list any methonds specific to the checking acc
}
