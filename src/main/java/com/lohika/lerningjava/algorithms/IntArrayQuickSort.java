package com.lohika.lerningjava.algorithms;

import java.util.Random;

public class IntArrayQuickSort {
    private Integer[] array;

    public IntArrayQuickSort(Integer[] array) {
        this.array = array;
    }

    public Integer[] sort() {
        int startIndex = 0;
        int endIndex = array.length - 1;
        return doSort(startIndex, endIndex);
    }

    private Integer[] doSort(int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return null;
        }
        int i = startIndex, j = endIndex;
        int currentIndex = i - (i - j) / 2;
        while (i < j) {
            while (array[i] <= array[currentIndex] && i < currentIndex) {
                i++;
            }
            while (array[currentIndex] <= array[j] && j > currentIndex) {
                j--;
            }
            if (i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                if (i == currentIndex) {
                    currentIndex = j;
                } else if (j == currentIndex) {
                    currentIndex = i;
                }
            }
        }
        doSort(startIndex, currentIndex);
        doSort(currentIndex + 1, endIndex);
        return array;
    }
}
