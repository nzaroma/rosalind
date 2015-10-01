package ru.roman.heap;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Roman on 01.10.2015.
 */
public class HeapPriorityQueue implements Heap {
    private int[] array;
    private int size;

    public HeapPriorityQueue(int[] array) {
        size = array.length + 1;
        this.array = new int[size];
        for (int i = 0; i < array.length; i++) {
            this.array[i + 1] = array[i]; //[0] we leave empty get rid of normalization
        }
        //sink elements
    }

    private void sink(int k) {
        //if k*2 exists
        //if k*2 + 1 exists
        //find min^
        // if array[k] < min -> swap(k, min[index])
        //k = index
    }

    private void swim(int k) {
        while (k < 1 && array[k] < array[k / 2]) {
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
}
