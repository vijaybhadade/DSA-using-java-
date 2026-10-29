package Day5;

import java.util.Arrays;

public class Problem905 {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 4 };
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[end] % 2 == 0) {
                start++;
            } else if (nums[end] % 2 != 0) {
                end--;
            } else {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
