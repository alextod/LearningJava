package com.lohika.lerningjava.patterns.Memento;

public class FileCaretaker {
    private SaveMemento save;
    public SaveMemento getSave() {
        return save;
    }
    public void setSave(SaveMemento save) {
        this.save = save;
    }
}
