package com.lohika.lerningjava.exceptions;

import com.lohika.lerningjava.BinaryTree;

/**
 * Created by atodorov on 10/14/2016.
 */
public class Program {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.add(5);
        tree.add(4);
        tree.add(7);
        tree.add(6);
        tree.add(2);
        tree.add(3);
        tree.add(1);
        tree.add(10);
        tree.add(8);
        tree.preOrderTraversal();
    }
}
