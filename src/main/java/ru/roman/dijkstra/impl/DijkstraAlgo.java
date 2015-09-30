package ru.roman.dijkstra.impl;

import ru.roman.dijkstra.FindRoute;

/**
 * Created by Roman on 30.09.2015.
 */
public class DijkstraAlgo implements FindRoute {
    private static final int MAX_VALUE = Integer.MAX_VALUE;

    @Override
    public int[] process(int size, int[][] vertexRelations) {
        boolean[] visited = new boolean[size];
        int[] returnArray = new int[size];
        setDistance(returnArray, MAX_VALUE);

        //iterate while there are exists not occupied vertexes
        while (true) {
            int vertex = normalize(findMinWeightForUnvisited(returnArray, visited));
            if (vertex == -1) {
                //no vertex found
                break;
            }

            //we use -1 because incoming data start from 1
            visited[vertex-1] = true;
            for (int i = 0; i < vertexRelations.length; i++) {
                if (vertexRelations[i][0] == vertex) {
                    int neighborVertex = vertexRelations[i][1];
                    if (!visited[neighborVertex-1] ){
                        returnArray[neighborVertex-1] = Math.min(returnArray[vertex-1] + vertexRelations[i][2], returnArray[neighborVertex-1]);
                    }
                }
            }
        }
        //replace unaccesible nodes with -1
        return prepareFinalArray(returnArray);
    }

    private void setDistance(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
        //set first element as start point with weight 0
        array[0] = 0;
    }

    private int findMinWeightForUnvisited(int[] weights, boolean[] visited) {
        int index = -1;
        int min = MAX_VALUE;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                if (weights[i] < min) {
                    min = weights[i];
                    index = i;
                }
            }
        }
        return index;
    }

    private int normalize(int value) {
        if (value != -1) {
            return ++value;
        }
        return value;
    }

    private int[] prepareFinalArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == MAX_VALUE) {
                array[i] = -1;
            }
        }
        return array;
    }
}
