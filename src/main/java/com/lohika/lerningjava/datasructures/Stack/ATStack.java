package com.lohika.lerningjava.datasructures.Stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

/**
 *
 * Stack realization based on LinkedList.
 * Stack is generic.
 * Stack is one directional.
 *
**/
public class ATStack<T> {
    private volatile LinkedList<T> stackList;

    public ATStack(){
        stackList = new LinkedList<>();
    }

    public synchronized void push(T element){
        stackList.addFirst(element);
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stackList.removeFirst();
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stackList.getFirst();
    }

    public int size(){
        return stackList.size();
    }

    public boolean isEmpty(){
        return size() == 0;
    }
}
