package org.example;

public class Main {
    public static void main(String[] args) {


//        Animal animal = new Animal();
//        animal.eatFood();
//        animal.breat();
//        animal.makeSound();
        Cat cat = new Cat("Барсик",10);
        Cat cat2 = new Cat ("Боб",15);
        cat.breat();
        cat.makeSound();
        System.out.println(cat.returnAge());
        System.out.println(cat.returnName());
        System.out.println(cat2.returnAge());
        System.out.println(cat2.returnName());
        cat.makeMjau("Mjjjjaaa");
        cat.eatFood();
        cat.makeMjau();
        cat.makeScratch();
        cat.eatFood();
        Class3 class3= new Class3();
        class3.digit();
        class3.digit2();
        
        }




    }

