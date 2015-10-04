package ru.roman.heap;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;

/**
 * Created by Roman on 01.10.2015.
 */
public class HeapPriorityQueue implements Heap {
    private int[] array;
    private int size;

    public HeapPriorityQueue(int[] array) {
        size = array.length;
        this.array = new int[size+1];
        for (int i = 0; i < size; i++) {
            this.array[i + 1] = array[i]; //[0] we leave empty get rid of normalization
        }
        //sink elements
        for (int i = size/2; i >= 1 ; i--) {
            sink(i);
        }
    }

    private void sink(int k) {
        while (2 * k <= size) {
            int j = 2 * k;
            if (j < size && array[j] < array[j + 1]) {
                j++;
            }
            if (array[j] < array[k]) {
                break;
            }
            swap(k, j);
            k = j;
        }
    }

    private void swim(int k) {
        while (k > 1 && array[k] < array[k / 2]) {
            swap(k, k / 2);
            k = k / 2;
        }
    }

    private void swap(int k1, int k2) {
        int temp = array[k1];
        array[k1] = array[k2];
        array[k2] = temp;
    }

    @Override
    public void insert(int a) {
        //resize array
        //add to the end
        //swim it up
        throw new NotImplementedException();
    }

    @Override
    public int max() {
        throw new NotImplementedException();
    }

    @Override
    public int delMax() {
        //swap with last element
        //delete last element
        //sink first element
        throw new NotImplementedException();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
