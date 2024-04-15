package Homework.HW12;

import java.util.PriorityQueue;
import java.util.Comparator;

public class HW12 {
    private int[] parent;

    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        parent = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < n; i++) {
            pq.offer(new int[] { wells[i], 0, i + 1 });
        }

        for (int[] pipe : pipes) {
            pq.offer(new int[] { pipe[2], pipe[0], pipe[1] });
        }

        int totalCost = 0;
        while (!pq.isEmpty()) {
            int[] edge = pq.poll();
            if (union(edge[1], edge[2])) {
                totalCost += edge[0];
            }
        }

        return totalCost;
    }

    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    private boolean union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            parent[rootY] = rootX;
            return true;
        }
        return false;
    }
}
