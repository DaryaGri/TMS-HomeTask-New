package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Cat", "Mammal", "White", "House", "Milk");
        Cat cat2 = new Cat();
        Cat cat3 = new Cat ("Cat", "Mammal", "White", "House", "Milk" );

        Crocodile cro = new Crocodile("Crocodile", "Reptiles", "River", "Animals");
        Crocodile cro2 = new Crocodile("Crocodile", "Reptiles", "Lake", "Fish");

        Animal[] cats = {cat, cat2, cat3};
        for(Animal a : cats){
            System.out.println(a);
        }
        cat.hunting("Mice");
        cat.eat();
        cat.makeNoise();
        cat.setNumOfMiceCaught(3);
        cat.miceCaught();
        System.out.println(cat.equals(cat3));

        System.out.println(cro);
        System.out.println(cro2);
        System.out.println(cro.info(20,100));
        cro.eat();
        cro2.eat();
        cro.makeNoise();
        System.out.println(cro.equals(cro2));

    }
}
