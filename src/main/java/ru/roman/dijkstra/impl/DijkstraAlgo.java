package ru.roman.dijkstra.impl;

import ru.roman.dijkstra.FindRoute;

/**
 * Created by Roman on 30.09.2015.
 */
public class DijkstraAlgo implements FindRoute {
    private static final int maxInt = Integer.MAX_VALUE;

    @Override
    public int[] process(int size, int[][] vertexRelations) {
        boolean[] visited = new boolean[size];
        int[] returnArray = new int[size];
        setDistance(returnArray, maxInt);
        returnArray[0] = 0;
        //iterate while there are exists not occupied vertexes
        while (true) {
            int vertex = -1;
            for (int i = 0; i < size; i++) {
                if (!visited[i]
                        && returnArray[i] < maxInt
                       // && (findMinDis[i])
                        ) {
                    vertex = i+1;
                }

            }
            if (vertex == -1) {
                //no vertex found
                break;
            }

            //check this vertex
            visited[vertex-1] = true;
            for (int i = 0; i < vertexRelations.length; i++) {
                if (vertexRelations[i][0] == vertex) {
                    int neighborVertex = vertexRelations[i][1];
                    if (!visited[neighborVertex-1] || (visited[neighborVertex-1] && (returnArray[vertex-1] + vertexRelations[i][2] < returnArray[neighborVertex-1]))) { //&& returnArray[neighborVertex-1] < maxInt) {
                        returnArray[neighborVertex-1] = Math.min(returnArray[vertex-1] + vertexRelations[i][2], returnArray[neighborVertex-1]);
                    }
                }
            }
        }

        return returnArray;
    }

    private void setDistance(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }
}
