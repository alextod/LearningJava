package com.lohika.lerningjava.datasructures.Queue;

import java.util.LinkedList;

public class ATQueue<T> {
    LinkedList<T> queue;

    public ATQueue() {
        this.queue = new LinkedList<>();
    }

    public T push(T element){
        queue.addLast(element);
        return element;
    }

    public T poll(){
        return queue.removeFirst();
    }

    public int size(){
        return queue.size();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        return "ATQueue" + queue;
    }
}
