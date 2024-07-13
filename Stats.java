package com.practice.Java;

public class Stats implements Cloneable{
    int streams;
    float height;
    int weight;
    String gender;

    public Stats(int streams) {
        this.streams = streams;
    }

    public Stats(float height, int weight, String gender) {
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public Stats(Stats stats) {
        this.streams = stats.streams;
    }
    @Override
    public Stats clone() throws CloneNotSupportedException {
        Stats stat = (Stats) super.clone();
        return stat;
    }

}