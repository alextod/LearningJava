package com.lohika.lerningjava.patterns.Prototype;

/**
 * Created by atodorov on 1/20/2017.
 */
public class PrototypeProgram {
    public static void main(String[] args) {
        Human original = new Human(18, "Vasya");
        System.out.println(original);

        Human copy = (Human) original.copy();
        System.out.println(copy);

        HumanFactory factory = new HumanFactory(copy);
        Human h1 = factory.makeCopy();
        System.out.println(h1);


        factory.setPrototype(new Human(30, "Janna"));
        Human h2 = factory.makeCopy();
        System.out.println(h2);
    }

}
