package com.example.startup;

public class Student<Student> {
    String name;
    String surname;
    String classroom;
    int age;
    int id;

    public Student(String name, String surname, String classroom, int age, int id) {
        this.name = name;
        this.surname = surname;
        this.classroom = classroom;
        this.age = age;
        this.id = id;
    }
    
}
