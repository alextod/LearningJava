package com.lohika.lerningjava.patterns.Memento;

public class Game {
    private String level;
    private int time;

    public void set(String level, int time){
        this.level = level;
        this.time = time;
    }

    public void load(SaveMemento save){
        this.level = save.getLevel();
        this.time = save.getTime();
    }

    public SaveMemento save(){
        return new SaveMemento(level, time);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", time=" + time +
                '}';
    }
}
