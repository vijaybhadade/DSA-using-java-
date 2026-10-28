
import java.util.Arrays;

public class ProblemReversion {
    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int[] result = new int[nums.length];
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
