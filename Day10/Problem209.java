package Day10;

public class Problem209 {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int n = nums.length;
        int target = 7;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            // Calculate sum to continew
            sum += nums[i];
            while (sum >= target) {

                // update min
                minLength = Math.min(minLength, i - left + 1);

                // remove left element
                sum -= nums[left];

                // move forward left
                left++;
            }
        }
       System.out.println(minLength==Integer.MAX_VALUE ? 0: minLength);
    }
}
