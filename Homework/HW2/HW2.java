package Homework.HW2;

public class HW2 {
    boolean isBadVersion(int version) {
        return false;
    }

    public int firstBadVersion(int n) {
        int start = 1, end = n;

        while (start < end) {
            if (isBadVersion(start)) {
                return start;
            }

            if (isBadVersion(end - 1)) {
                end--;
            } else {
                return end;
            }
            start++;
        }

        return start;
    }
}
