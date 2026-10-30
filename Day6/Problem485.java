package Day6;

public class Problem485 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        int n = nums.length;
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {

            if (nums[i] == 1) {
                count++;
            }
            else{
                count=0;
            }
            maxCount = Math.max(maxCount, count);

        }
        System.out.println(maxCount);

    }
}
