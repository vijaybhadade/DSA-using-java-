package Day10;

public class Problem724 {
    public static void main(String[] args) {
        int[] nums = { 2,1,-1};
        int n = nums.length;
        int totalSum = 0;
        int leftSum = 0;

        // calculate totalSum
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

        // find privote index
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (rightSum == leftSum) {
                System.out.println(i);
            } else {
                leftSum+=nums[i];
            }
        }
        System.out.println(-1);
    }
}
