package Day11;

public class Problem643 {
    public static void main(String[] args) {
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        int n = nums.length;
        int k = 4;
        int sum = 0;
        double maxAver = Double.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        // Calculate sum remain number
        maxAver = (double) sum / k;

        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k];
            double currentAverage=(double)sum/k;
            maxAver = Math.max(maxAver,currentAverage);
        }

        System.out.println(maxAver);
    }
}
