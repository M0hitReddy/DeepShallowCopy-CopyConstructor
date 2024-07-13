package com.practice.Java;

public class Person implements Cloneable{
    String name;
    int age;
    Stats stats;
    public Person(String name, int age, Stats stats) {
        this.age = age;
        this.name = name;
        this.stats = stats;
    }
    @Override
    public Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.stats = (Stats) stats.clone();
        return person;
    }
    public void printAll() {
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("Stats: ");
        System.out.print("    ");
        System.out.println("height: " + this.stats.height);
        System.out.print("    ");
        System.out.println("weight: " + this.stats.weight);
        System.out.print("    ");
        System.out.println("gender: " + this.stats.gender);

    }
}
