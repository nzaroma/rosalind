package ru.roman.heap;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Roman on 03.10.2015.
 */
public class HeapTest {

    @Test
    public void testHeapRosalindData() {
        int[] data = new int[]{1, 3, 5, 7, 2};
        Heap heap = new HeapPriorityQueue(data);
        System.out.println(heap);
        //some assert data should be here
        //but now onnly visual control
    }

    @Test
    public void testInsert() {
        int[] data = new int[]{7, 5, 2, 6};
        Heap heap = new HeapPriorityQueue(data);
        System.out.println(heap);
        heap.insert(8);
        System.out.println(heap);
        heap.insert(9);
        System.out.println(heap);
    }

    @Test
    public void testMax() {
        int[] data = new int[]{7, 9, 2, 6};
        Heap heap = new HeapPriorityQueue(data);
        int result = heap.max();
        Assert.assertEquals(9, result);
    }

    @Test
    public void testDelMax() {
        int[] data = new int[]{7, 9, 2, 6};
        Heap heap = new HeapPriorityQueue(data);
        int result = heap.delMax();
        Assert.assertEquals(7, result);
    }
}
