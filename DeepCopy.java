package com.practice.Java;

public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Mohit", 20, new Stats(5.4f, 57, "Male"));
        Person p2 = (Person) p1.clone();
//        p1.printAll();
//        p2.printAll();
        p2.stats.weight = 70;
        p1.printAll(); // p1's weightdoesnot change if we change p2.stats.weight because p1.stats and p2.stats are both diff objects;
        System.out.println(p1.stats == p2.stats); // false because new copy of each object is created
    }
}
