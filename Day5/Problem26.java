package Day5;

import java.util.Arrays;

public class Problem26 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 5 };
        int n = nums.length;
        int k = 1;
        for (int i = 1; i < n ; i++) {

            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println("k="+k);
        System.out.println(Arrays.toString(nums));

    }
}
