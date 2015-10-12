package ru.roman.mergesort;

import org.junit.Assert;
import org.junit.Test;
import ru.roman.mergesort.impl.MergeSort;

import java.util.Arrays;

/**
 * Created by Roman on 28.09.2015.
 */
public class MergeTest {

    @Test
    public void testSort() {
        int[] array = {8, 9 ,1,0,3,5,6,7,8,4};
        int[] copyArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        System.out.println(Arrays.toString(array));
        Sort mergeSort = new MergeSort();
        mergeSort.sort(array);
        System.out.println(Arrays.toString(array));
        Arrays.sort(copyArray);
        System.out.println(Arrays.toString(copyArray));
        for (int i = 0; i < array.length; i++) {
            Assert.assertEquals(copyArray[i], array[i]);
        }
    }
}
