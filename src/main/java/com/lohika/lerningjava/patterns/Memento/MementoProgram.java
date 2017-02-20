package com.lohika.lerningjava.patterns.Memento;

public class MementoProgram {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Saving game");
        game.set("lvl_1", 60);
        System.out.println(game);

        FileCaretaker file = new FileCaretaker();
        file.setSave(game.save());

        game.set("lvl_2", 100);
        System.out.println(game);

        System.out.println("Loading from save....");
        game.load(file.getSave());
        System.out.println(game);
    }
}
