package ru.roman.mergesort.impl;

import ru.roman.mergesort.Sort;

/**
 * Created by Roman on 28.09.2015.
 */
public class MergeSort implements Sort {
    private int[] copyArray;

    @Override
    public void sort(int[] array) {
        copyArray = array;
        int lowerIndex = 0;
        int higherIndex = array.length - 1;
        mergeSort(lowerIndex, higherIndex);
    }

    private void mergeSort(int lowerIndex, int higherIndex) {
        int middle = higherIndex / lowerIndex;
        mergeSort(lowerIndex, middle);
        mergeSort(middle + 1, higherIndex);
        merge(lowerIndex, middle, higherIndex);
    }

    private void merge(int lowerIndex, int middle, int higherIndex) {
        int totalCounter = lowerIndex;
        int i = lowerIndex;
        int j = middle + 1;
        
    }
}
