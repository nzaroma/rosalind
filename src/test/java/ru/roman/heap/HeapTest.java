package ru.roman.heap;

import org.junit.Test;

import java.util.Iterator;

/**
 * Created by Roman on 03.10.2015.
 */
public class HeapTest {

    @Test
    public void testHeapRosalindData() {
        int[] data = new int[]{1, 3, 5, 7, 2};
        Heap heap = new HeapPriorityQueue(data);
        System.out.println(heap);
    }

    
}
