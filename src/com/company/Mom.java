package com.company;

public class Mom extends Dad {
    public Mom(String name, int age) {
        super(name, age);
    }


    public void print(){
        System.out.println(getName() + "   " + getAge());
    }


}
