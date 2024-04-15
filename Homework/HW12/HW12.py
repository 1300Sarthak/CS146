from typing import List


class HW12:
    def __init__(self):
        self.parent = []

    def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
        self.parent = list(range(n + 1))

        pq = []
        for i in range(n):
            pq.append((wells[i], 0, i + 1))

        for pipe in pipes:
            pq.append((pipe[2], pipe[0], pipe[1]))

        pq.sort()

        total_cost = 0
        for cost, house1, house2 in pq:
            if self.union(house1, house2):
                total_cost += cost

        return total_cost

    def find(self, x):
        if self.parent[x] != x:
            self.parent[x] = self.find(self.parent[x])
        return self.parent[x]

    def union(self, x, y):
        rootX = self.find(x)
        rootY = self.find(y)
        if rootX != rootY:
            self.parent[rootY] = rootX
            return True
        return False
