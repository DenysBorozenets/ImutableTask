package com.denis;

import java.util.Date;

public class ImmutableClassStudent {
    private final Age age;
    private final String name;


    public ImmutableClassStudent(String name, Age age) {
        this.name = name;
        Age cloneAge = new Age();
        cloneAge.setYear(age.getYear());
        this.age = cloneAge;

    }

    public Age getAge() {
        Age cloneAge= new Age();
        cloneAge.setYear(this.age.getYear());
        return cloneAge;
    }

    public String getName() {
        return name;
    }

}
