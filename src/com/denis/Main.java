package com.denis;

public class Main {

    public static void main(String[] args) {

        Age age = new Age();
        age.setYear(1992);

        ImmutableClassStudent student =
                new ImmutableClassStudent("Alex", age);
        System.out.println("Alex year = " + student.getAge().getYear());
        student.getAge().setYear(1993);
        System.out.println("Alex year = " + student.getAge().getYear());

    }
}
