package com.denis;

public class Main {

    public static void main(String[] args) {
	Age age = new Age();
	age.setYear(10);

	ImmutableClassStudent immutableClassStudent = new ImmutableClassStudent(age, "Andrew");
        System.out.println("Name " + immutableClassStudent.getName() +
                " Age " + immutableClassStudent.getAge().getYear());
        
    }
}
