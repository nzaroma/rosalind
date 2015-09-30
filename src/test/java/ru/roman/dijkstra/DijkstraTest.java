package ru.roman.dijkstra;

import org.junit.Assert;
import org.junit.Test;
import ru.roman.dijkstra.impl.DijkstraAlgo;

import java.util.Arrays;

/**
 * Created by Roman on 30.09.2015.
 */
public class DijkstraTest {

    @Test
    public void testRosalindData() {
        int[][] vertexRelations =   //new int[10][3];
                new int[][]{
                        {3, 4, 4},
                        {1, 2, 4},
                        {1, 3, 2},
                        {2, 3, 3},
                        {6, 3, 2},
                        {3, 5, 5},
                        {5, 4, 1},
                        {3, 2, 1},
                        {2, 4, 2},
                        {2, 5, 3},
                };
        int size = 6;
        FindRoute route = new DijkstraAlgo();
        int[] resultData = route.process(size, vertexRelations);
        System.out.println(Arrays.toString(resultData));

        int[] rightData = new int[] {0, 3, 2, 5, 6, -1};
        System.out.println(Arrays.toString(rightData));

        for (int i = 0; i < resultData.length; i++) {
            Assert.assertEquals(rightData[i], resultData[i]);
        }
    }
}
