package Day12;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = twoSum(nums, target);

        // Print the result indices
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int element = target - nums[i];

            if (map.containsKey(element)) {
                return new int[] { map.get(element), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}
