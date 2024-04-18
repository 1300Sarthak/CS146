from typing import List


class Lab7:
    def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:
        import sys
        dist = [[sys.maxsize] * n for _ in range(n)]
        for i in range(n):
            dist[i][i] = 0

        for u, v, w in edges:
            dist[u][v] = w
            dist[v][u] = w

        for k in range(n):
            for i in range(n):
                for j in range(n):
                    if dist[i][j] > dist[i][k] + dist[k][j]:
                        dist[i][j] = dist[i][k] + dist[k][j]

        min_reachable = sys.maxsize
        city_with_min_reachable = -1
        for i in range(n):
            count = sum(1 for j in range(n) if i !=
                        j and dist[i][j] <= distanceThreshold)

            if count < min_reachable or (count == min_reachable and i > city_with_min_reachable):
                min_reachable = count
                city_with_min_reachable = i

        return city_with_min_reachable


sol = Lab7()
# Expected Output: 3
print(sol.findTheCity(4, [[0, 1, 3], [1, 2, 1], [1, 3, 4], [2, 3, 1]], 4))
print(sol.findTheCity(5, [[0, 1, 2], [0, 4, 8], [1, 2, 3], [
      1, 4, 2], [2, 3, 1], [3, 4, 1]], 2))  # Expected Output: 0
