package ru.roman.mergesort.impl;

import ru.roman.mergesort.Sort;

/**
 * Created by Roman on 28.09.2015.
 */
public class MergeSort implements Sort {
    private int[] copyArray;
    private int[] resultArray;

    @Override
    public void sort(int[] array) {
        resultArray = array;
        copyArray =  new int[array.length];
        int lowerIndex = 0;
        int higherIndex = array.length - 1;
        mergeSort(lowerIndex, higherIndex);
    }

    private void mergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex == higherIndex) {
            return;
        }
        int middle = (higherIndex + lowerIndex) / 2;
        mergeSort(lowerIndex, middle);
        mergeSort(middle + 1, higherIndex);
        merge(lowerIndex, middle, higherIndex);
    }

    private void merge(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            copyArray[i] = resultArray[i];
        }
        int totalCounter = lowerIndex;
        int left = lowerIndex;
        int right = middle + 1;
        while (left <= middle && right <= higherIndex) {
            if (copyArray[left] <= copyArray[right]) {
                resultArray[totalCounter] = copyArray[left];
                left++;
            } else {
                resultArray[totalCounter] = copyArray[right];
                right++;
            }
            totalCounter++;
        }
        while (left <= middle) {
            resultArray[totalCounter] = copyArray[left];
            left++;
        }
    }
}
