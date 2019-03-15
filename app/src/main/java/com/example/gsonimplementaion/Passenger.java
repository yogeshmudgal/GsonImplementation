package com.example.gsonimplementaion;

import com.google.gson.annotations.Expose;

public class Passenger {

    @Expose
    String name;
    @Expose
    int age;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
