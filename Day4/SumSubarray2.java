public class SumSubarray2 {
    public static void Solution(int[] num) {
        int max_sum = Integer.MIN_VALUE; // -infinity
        int currSum;
        int[] prefix = new int[num.length];
        
        prefix[0] = num[0];
        // calculate prefix sum
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + num[i];
        }

        // find maximum subarray sum
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];
                if (max_sum < currSum) {
                    max_sum = currSum;
                }
            }
        }
        System.out.println("max sum of number in array: " + max_sum);
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        Solution(num);
    }
}
