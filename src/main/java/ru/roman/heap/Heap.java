package ru.roman.heap;

/**
 * Created by Roman on 01.10.2015.
 */
public interface Heap {
    void insert(int a);

    int max();

    int delMax();

    boolean isEmpty();

    int size();
}
