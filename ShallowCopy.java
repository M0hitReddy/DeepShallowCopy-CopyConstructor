package com.practice.Java;

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Song s1 = new Song("paro", "spanish", new Artist("Nej", 23, new Stats(100000)));
        Song s2 = (Song) s1.clone();
        Song s3 = new Song(s1); // copy constructor
//        s3.artist = new Artist("Skrill", 30, new Stats(2000000));
        s2.name = "Allo";
        s2.artist.name = "Skrill"; // only the references are copied. So if we change the object of that reference , even s1 will be changed.
        s1.printAll();
//        s2.printAll();
        s3.printAll();
        System.out.println(s1.artist == s2.artist); // true because both references are same;
    }
}
