package com.hexlet;

public class Main {

    public  static  void main(String[] atgs) {
        Human human = new Human();
        human.setName("Max");
        System.out.println(human.getName());
        human.setAge(22);
        System.out.println(human.getAge());
        human.setAge(199);
        System.out.println(human.getAge());
        human.setAge(-199);
        System.out.println(human.getAge());
        human.setName("Kolya");
        System.out.println(human.getName());
        human.setName(null);
        System.out.println(human.getName());
        human.setName("M");
        System.out.println(human.getName());
    }
}
