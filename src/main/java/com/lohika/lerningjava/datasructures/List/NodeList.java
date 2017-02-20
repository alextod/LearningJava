package com.lohika.lerningjava.datasructures.List;

import com.sun.org.apache.xpath.internal.axes.IteratorPool;

import java.util.*;

public class NodeList<T extends Comparable<T>> {

    private class Node implements Comparable<Node> {
        T value;
        Node next;

        Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value.toString();
        }

        @Override
        public int compareTo(Node o) {
            return o.value.compareTo(value);
        }
    }

    private Node first, last;
    private int size;

    public NodeList() {
        this.size = 0;
    }

    public void add(T value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }
    public T add2(T value) {
        Node node = new Node(value);
        if (first == null){
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
        return value;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder resultString = new StringBuilder();
        Node tmp = first;
        while (tmp != null) {
            resultString.append(tmp);
            resultString.append(" ");
            tmp = tmp.next;
        }
        return resultString.toString();
    }

    public Iterator<T> getIterator(){
        if (size == 0) {
            return Collections.<T>emptyList().iterator();
        }
        return new Iterator<T>() {
            Node currentNode = null;
            @Override
            public boolean hasNext() {
                return currentNode != last;
            }

            @Override
            public T next() {
                if (currentNode == null) {
                    currentNode = first;
                    return currentNode.value;
                }
                if (currentNode.next == null) {
                    return (T) new NoSuchElementException();
                }
                currentNode = currentNode.next;
                return currentNode.value;
            }
        };
    }

    public T find(T value) {
        if (first == null) {
            return null;
        }
        Node target = new Node(value);
        Node current = first;
        do {
            if (current.compareTo(target) == 0) {
                return target.value;
            }
            current = current.next;
        } while (current != null);
        return null;
    }
}
