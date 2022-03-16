package com.company;

public class Main {

    public static void main(String[] args) {
        Dad famly[] = {Famly(1), Famly(2), Famly(3)};
        for (int i = 0; i < famly.length; i++) {
            if (i< famly.length && famly[i] instanceof Printable){
                famly[i].print();
            }

        }

    }


    public static Dad Famly(int Dad){
        Mom mom = new Mom("Almash", 53);
        Daughter daughter = new Daughter ("Rano",16);
        Child child = new Child("Gosha", 2);
        switch (Dad){
            case 1:
                return mom;
            case 2:
                return daughter;
            case 3:
                return child;

        }
        Dad dad[] = {mom, daughter, child};
        return null;
    }




}