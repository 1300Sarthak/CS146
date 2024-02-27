package Homework.HW7;

import java.util.Arrays;

public class HW7 {

    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0)
            return 0;

        int[] startTimes = new int[intervals.length];
        int[] endTimes = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            startTimes[i] = intervals[i][0]; // set the start time
            endTimes[i] = intervals[i][1]; // set the end time
        }

        Arrays.sort(startTimes); // sort start times
        Arrays.sort(endTimes);

        int startPointer = 0, endPointer = 0;
        int usedRooms = 0;

        while (startPointer < intervals.length) { // iterating over start time
            if (startTimes[startPointer] >= endTimes[endPointer]) {
                usedRooms -= 1; // freeing up a server
                endPointer += 1; // ext end time
            }

            usedRooms += 1;
            startPointer += 1;
        }

        return usedRooms;
    }

    public static void main(String[] args) {
        HW7 solution = new HW7(); // create solution

        int[][] intervals1 = { { 0, 30 }, { 5, 10 }, { 15, 20 } }; // defining test case 1
        int[][] intervals2 = { { 0, 1 }, { 1, 2 }, { 2, 3 } }; // defining test case 2

        System.out.println(solution.minMeetingRooms(intervals1)); // expected: 2
        System.out.println(solution.minMeetingRooms(intervals2)); // expected: 1
    }
}
