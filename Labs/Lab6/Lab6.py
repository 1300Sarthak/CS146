class Lab6:
    def canFinish(self, numCourses, prerequisites):
        indegree = [0] * numCourses
        for a, b in prerequisites:
            indegree[a] += 1

        queue = [i for i in range(numCourses) if indegree[i] == 0]

        count = 0
        while queue:
            current = queue.pop(0)
            count += 1
            for a, b in prerequisites:
                if b == current:
                    indegree[a] -= 1
                    if indegree[a] == 0:
                        queue.append(a)

        return count == numCourses
