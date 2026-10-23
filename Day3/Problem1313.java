public class Problem1313 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3 };
        int n = nums.length;

        int total = 0;
        for (int i = 0; i < n; i += 2) {
            total += nums[i];
        }

        int[] result = new int[total];
        int index = 0;
        for (int i = 0; i < n; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                result[index++] = val;
            }
        }

        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");

    }
}
