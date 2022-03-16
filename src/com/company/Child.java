package com.company;

public class Child extends Dad{
    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() {
        System.out.println(getName() + "   " + getAge());

    }
}
