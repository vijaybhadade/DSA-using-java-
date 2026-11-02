package Day9;



public class Problem268 {
    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        int n = nums.length;
        int missinNumber=0;
         // Expected sum
            int expectedSum = n * (n + 1) / 2;
            int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // Actual sum
               actualSum += nums[i];
        }
         //Calculate missinNumber
            missinNumber=expectedSum-actualSum;
        System.out.println(missinNumber);
    }
}
