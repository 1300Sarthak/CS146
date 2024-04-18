package Labs.Lab7;

import java.util.Arrays;

public class Lab7 {

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n];

        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE / 2);
        }

        for (int i = 0; i < n; i++) {
            dist[i][i] = 0;
        }

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            dist[u][v] = w;
            dist[v][u] = w;
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        int minCity = -1;
        int minReachable = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && dist[i][j] <= distanceThreshold) {
                    count++;
                }
            }
            if (count < minReachable || (count == minReachable && i > minCity)) {
                minCity = i;
                minReachable = count;
            }
        }

        return minCity;
    }

    public static void main(String[] args) {
        Lab7 lab7 = new Lab7();
        // Example Usage
        System.out.println(
                lab7.findTheCity(4, new int[][] { { 0, 1, 3 }, { 1, 2, 1 }, { 1, 3, 4 }, { 2, 3, 1 } }, 4)); // Expected
                                                                                                             // Output:
                                                                                                             // 3
        System.out.println(
                lab7.findTheCity(5,
                        new int[][] { { 0, 1, 2 }, { 0, 4, 8 }, { 1, 2, 3 }, { 1, 4, 2 }, { 2, 3, 1 }, { 3, 4, 1 } },
                        2)); // Expected Output: 0
    }
}
