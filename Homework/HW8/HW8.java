package Homework.HW8;

public class HW8 {

    public int longestPalindrome(String s) {
        int[] charCounts = new int[128];
        for (char c : s.toCharArray()) {
            charCounts[c]++;
        }

        int length = 0;
        for (int count : charCounts) {
            length += count / 2 * 2;
            if (length % 2 == 0 && count % 2 == 1) {
                length++;
            }
        }

        return length;
    }
}
