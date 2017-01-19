package com.lohika.lerningjava;

/**
 * Created by atodorov on 10/14/2016.
 */
public class BinaryTreeNode <T extends Comparable<T>> {

    private T value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public int compareTo(T obj) {
        return this.value.compareTo(obj);
    }
}
