package com.lohika.lerningjava;

/**
 * Created by atodorov on 10/14/2016.
 */
public class BinaryTree <T extends Comparable<T>> {
    private BinaryTreeNode<T> root;
    private int count = 0;

    public void add(T value){
        if(root == null){
            root = new BinaryTreeNode<T>(value);
        }
        else {
            addTo(root, value);
        }

        count++;
    }

    private void addTo(BinaryTreeNode<T> node, T value) {
        if(node.getValue().compareTo(value) == 1){
            if(node.getLeft() == null)
                node.setLeft(new BinaryTreeNode<T>(value));
            else
                addTo(node.getLeft(), value);
        }
        else {
            if(node.getRight() == null)
                node.setRight(new BinaryTreeNode<T>(value));
            else
                addTo(node.getRight(), value);
        }
    }

    public boolean contains(T value){
        BinaryTreeNode<T> parent = root;
        return findWithParent(value, parent) != null;
    }

    private BinaryTreeNode<T> findWithParent(T value, BinaryTreeNode<T> parent){
        BinaryTreeNode<T> current = parent;
        int result = current.compareTo(value);
        if(result > 0){
            current = current.getLeft();
            findWithParent(value, current);
        }
        else if (result < 0){
            current = current.getRight();
            findWithParent(value, current);
        }
        else
            return current;
        if (current == null)
            return null;
        else
            return current;

    }

    public void preOrderTraversal(){
        preOrderTraversal(root);
    }

    private void preOrderTraversal(BinaryTreeNode<T> node) {
        if(node!=null)
        {
            System.out.println(node.getValue());
            preOrderTraversal(node.getLeft());
            preOrderTraversal(node.getRight());
        }
    }
}
