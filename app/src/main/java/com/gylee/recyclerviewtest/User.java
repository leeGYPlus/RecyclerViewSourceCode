package com.gylee.recyclerviewtest;

import java.util.ArrayList;
import java.util.List;

class User {
    private String name;
    public static List<User> users = new ArrayList<>();


    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
