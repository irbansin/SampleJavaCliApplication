package com.anirban;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");

        var person1 = new Person("john", 12);
        System.out.println(person1);
        person1.setName("Raj");
        System.out.println(person1);
    }
}
