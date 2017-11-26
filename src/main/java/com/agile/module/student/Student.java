package com.agile.module.student;

public class Student {

    // instance variable (class level variable)
    private String name;

    // Constructor, by default, it's invisible.
    public Student() {

    }

    // Constructor with one String type parameter.
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
