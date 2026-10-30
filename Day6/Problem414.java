package Day6;

public class Problem414 {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 3, 1 };
        int n = nums.length;
        long firstMax = Long.MIN_VALUE;
        long secoundMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == firstMax || nums[i] == secoundMax || nums[i] == thirdMax) {
                continue;
            }

            if (nums[i] > firstMax) {
                thirdMax = secoundMax;
                secoundMax = firstMax;
                firstMax = nums[i];
                count++;
            } else if (nums[i] > secoundMax) {
                thirdMax = secoundMax;
                secoundMax = nums[i];
                count++;
            } else if (nums[i] > thirdMax) {
                thirdMax = nums[i];
                count++;
            }

        }
        if (count < 3) {
            System.out.println(firstMax);
        }

        System.out.println(thirdMax);
    }
}
