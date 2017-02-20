package com.lohika.lerningjava.datasructures;

import com.lohika.lerningjava.datasructures.BinarySearchTree.BinaryTree;
import com.lohika.lerningjava.datasructures.List.NodeList;
import com.lohika.lerningjava.datasructures.Queue.ATQueue;
import com.lohika.lerningjava.datasructures.Stack.ATStack;

import java.util.EmptyStackException;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class DataMain {
    public static void main(String[] args) {
        NodeList<Integer> list = new NodeList();
        list.add(12);
        list.add(15);
        list.add(17);
        list.add(43);
        list.add(21);
        System.out.println(list.toString());
    }

    private static void ATQueueTest() {
        ATQueue<Integer> queue = new ATQueue<>();
        for (int i = 0; i < 5; i++) {
            queue.push(i);
            System.out.println(queue);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(queue.poll());
        }
    }

    private static void getTreeHeight() {
        BinaryTree<Integer> integerBinaryTree = new BinaryTree<>();
        integerBinaryTree.add(3);
        integerBinaryTree.add(2);
        integerBinaryTree.add(1);
        integerBinaryTree.add(5);
        integerBinaryTree.add(4);
        integerBinaryTree.add(6);
        integerBinaryTree.add(7);

        System.out.println(integerBinaryTree.getHeight(integerBinaryTree.getRoot()));
    }

    private static void testATStack() {
        ATStack<String> stringATStack = new ATStack<>();
        AtomicInteger thread2counter = new AtomicInteger(0);
        ThreadLocal<Integer> integerThreadLocal = ThreadLocal.withInitial(()->0);
        integerThreadLocal.set(5);

        try {
            stringATStack.peek();
        } catch (EmptyStackException e){
            stringATStack.push("Stack is empty, please push any value first.");
            System.out.println(stringATStack.pop());
            System.out.println("Stack size is " + stringATStack.size());
        }

        Thread thread1 = new Thread(() -> {
            Random random = new Random();
            do {
                stringATStack.push(String.valueOf(random.nextInt(1000)));
                integerThreadLocal.set(integerThreadLocal.get() + 1);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    break;
                }
            } while (true);
            System.out.println("Thread 1 - finished.");
            System.out.println("Thread 1 threadLocal = " + integerThreadLocal.get());
        });

        Thread thread2 = new Thread(() -> {
            while (thread1.isAlive()) {
                thread2counter.incrementAndGet();
                if (!stringATStack.isEmpty()) {
                    System.out.println(stringATStack.pop());
                    integerThreadLocal.set(integerThreadLocal.get() + 2);
                }
            }
            System.out.println("Thread 2 - finished.");
            System.out.println("Thread 2 threadLocal = " + integerThreadLocal.get());
        });

        thread1.start();
        thread2.start();

        try {
            System.out.println("Main thread " + Thread.currentThread().getName() + " goes to sleep for 20 seconds");
            Thread.sleep(20000);
            if(thread1.isAlive()) {
                thread1.interrupt();
            }
        }catch (InterruptedException e){
            System.out.println("ooooooops");
        }
        System.out.println("Main thread is awake");
        System.out.println("Thread2 iterations " + thread2counter.get());
        System.out.println(stringATStack.size());
        System.out.println("Main threadlocal = " + integerThreadLocal.get());
    }
}
