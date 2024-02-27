class HW7:
    def minMeetingRooms(self, intervals):
        if not intervals:
            return 0

        startTimes = sorted([i[0] for i in intervals])  # sort start times
        endTimes = sorted([i[1] for i in intervals])  # sort end times

        startPointer, endPointer = 0, 0
        usedRooms = 0

        while startPointer < len(intervals):
            if startTimes[startPointer] >= endTimes[endPointer]:
                usedRooms -= 1  # freeing up a server
                endPointer += 1  # move to next end time

            usedRooms += 1
            startPointer += 1

        return usedRooms


if __name__ == "__main__":
    solution = HW7()  # create solution instance

    intervals1 = [[0, 30], [5, 10], [15, 20]]  # defining test case 1
    intervals2 = [[0, 1], [1, 2], [2, 3]]  # defining test case 2

    print(solution.minMeetingRooms(intervals1))  # expected: 2
    print(solution.minMeetingRooms(intervals2))  # expected: 1
