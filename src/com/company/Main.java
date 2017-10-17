package com.company;

public class Main {

    public static void main(String[] args) {

        Animal a = new Animal("The overloaded constructor has run");
        a.setName("Yogi Bear");
        System.out.println("The animal is called" + a.getName());
        System.out.println(a.displayWhatAnAnimalDoes());

        Animal b = new Animal();
        b.setName("Smokey the Bear");
        System.out.println("This animal is called" + b.getName());
        System.out.println(b.displayWhatAnAnimalDoes());
        System.out.println(b.speak());

        System.out.println("----------------------------------");

        Bird c = new Bird();
        c.setColor("Orange/Black");
        c.setWeight(1200000);
        System.out.println(c.displayWhatAnAnimalDoes());
        System.out.println(c.fly());
        System.out.println(c.speak());
        System.out.println(c.getColor());
        System.out.println(c.getWeight());

        System.out.println("----------------------------------");

        Cat d = new Cat();
        System.out.println(d.speak());
        System.out.println(d.scratchBite());

        System.out.println("----------------------------------");

        Unicorn u = new Unicorn();
        System.out.println(u.fly());
        System.out.println(u.magic());

        System.out.println("----------------------------------");
        }
}
