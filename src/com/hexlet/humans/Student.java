package com.hexlet.humans;

//import com.hexlet.common.Course; // один класс
//import com.hexlet.common.*; // все классы из пакета
public class Student {
    public String name = "N/A";

    public int age = 15;
    public com.hexlet.common.Course course = new com.hexlet.common.Course();
    public void sayHello() {
        System.out.println("Hello!!!");
        System.out.println("My name is - " + name);
        System.out.println("My age is - " + age);
        course.aboutCourse();
    }
}
