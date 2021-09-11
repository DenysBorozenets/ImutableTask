package com.denis;

import java.util.Date;

final public class ImmutableClassStudent {
    private final Age age;
    private final String name;


    public ImmutableClassStudent(Age age, String name) {
        this.age = age;
        this.name = name;

    }

    public Age getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
