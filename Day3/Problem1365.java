public class Problem1365 {
    public static void main(String[] args) {
        int[] nums = { 6, 5, 4, 8 };
        int n = nums.length;
        int[] result = new int[n];
        System.out.print("[");
        // outer loop
        for (int i = 0; i < n; i++) {
            int count = 0;
            // inner loop

            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }

            // add that counted values into empty array
            result[i] = count;

            // print that final result
            System.out.print(result[i]);

            // add commas to every number after and before last element count
            if (i < n - 1) {
                System.out.print(",");
            }

        }
        System.out.print("]");

    }
}
