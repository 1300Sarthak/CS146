package Labs;

import java.util.HashMap;
import java.util.Map;

public class Lab1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }

    public static void main(String[] args) {
        Lab1 solution = new Lab1();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] indices = solution.twoSum(nums, target);
        System.out.println("Index1: " + indices[0] + ", Index2: " + indices[1]);
    }
}
