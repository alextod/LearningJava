package com.lohika.lerningjava.algorithms;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class IntArrayQuickSortTest {
    @Test
    public void sort() throws Exception {
        int size = 1000000;
        Integer[] array = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        printArray(array);
        IntArrayQuickSort quickSort = new IntArrayQuickSort(array);
        Integer[] sortedArray = quickSort.sort();
        printArray(sortedArray);
    }
    private void printArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}