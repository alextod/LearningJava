package com.lohika.lerningjava.patterns.Prototype;

/**
 * Created by atodorov on 1/20/2017.
 */
public class HumanFactory {
    Human human;

    public HumanFactory(Human human) {
        setPrototype(human);
    }

    public void setPrototype(Human human){
        this.human = human;
    }

    Human makeCopy(){
        return (Human) human.copy();
    }
}
