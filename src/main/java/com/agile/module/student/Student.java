package com.agile.module.student;

public class Student {

    private String myName;


    // Constructor, by default, it's invisible.
    public Student() {

    }

    // Constructor with one String type parameter.
    public Student(String name) {
        myName = name;
    }
    public String getName() {
        return myName;
    }

}
