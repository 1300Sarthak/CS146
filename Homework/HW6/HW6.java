import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HW6 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Sorts array
        List<List<Integer>> result = new ArrayList<>(); // Init variables
        int n = nums.length;

        for (int i = 0; i < n; i++) { // Iterate nums
            if (i > 0 && nums[i] == nums[i - 1]) { // Skip duplicates
                continue;
            }

            Set<Integer> seen = new HashSet<>(); // Track seen nums
            for (int j = i + 1; j < n; j++) { // Iterate rest
                int complement = -nums[i] - nums[j]; // Find complement
                if (seen.contains(complement)) { // Checking if complement seen
                    // Adds the triplet
                    result.add(Arrays.asList(nums[i], nums[j], complement));
                    while (j + 1 < n && nums[j] == nums[j + 1]) { // Skip duplicates
                        j++;
                    }
                }
                seen.add(nums[j]); // Adds to seen
            }
        }

        return result; // Returns the result
    }

    public static void main(String[] args) {
        HW6 hw6 = new HW6();
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + hw6.threeSum(nums));
    }
}
