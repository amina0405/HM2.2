package com.company;

public class Daughter extends Dad {

    public Daughter(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() {
        System.out.println(getName() + "   " + getAge());

    }
}
