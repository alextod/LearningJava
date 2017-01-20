package com.lohika.lerningjava.patterns.Prototype;

/**
 * Created by atodorov on 1/20/2017.
 */
public class Human implements Copyable {

    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Object copy() {
        Human copy = new Human(age, name);
        return copy;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
