import java.util.Arrays;

public class Problem288 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 5, 6 };
        int n = nums.length;
    
        for (int i = 0, j = 0; j < n; j++) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }


        System.out.println(Arrays.toString(nums));

    }
}
