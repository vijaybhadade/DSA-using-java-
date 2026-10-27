import java.util.Arrays;

public class Problem977 {
    public static void main(String[] args) {
        int[] nums = { -4,-1,0,3,10};
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int index = n - 1;
        int[] result = new int[n];
        while (left <= right) {
            int largetLeft = nums[left] * nums[left];
            int largetRight = nums[right] * nums[right];
            if (largetLeft > largetRight) {
                result[index] = largetLeft;
                left++;
                index--;
            } else {
                result[index] = largetRight;
                right--;
                index--;
            }
        }
        System.out.println(Arrays.toString(result));

    }
}