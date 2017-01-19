package com.lohika.lerningjava.patterns.Strategy;

/**
 * Created by atodorov on 10/14/2016.
 */
public class Context {
    private Strategy strategy;

    public Context(){

    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int a, int b){
        strategy.execute(a, b);
    }
}
