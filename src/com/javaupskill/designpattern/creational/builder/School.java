package com.javaupskill.designpattern.creational.builder;

public class School {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder("Nik", "hil")
                .addAge("25")
                .addGender("M")
                .addHasExperience(true)
                .build(); // to get back new student object
        //Printing the student object
        System.out.println(student.toString());
    }
}
