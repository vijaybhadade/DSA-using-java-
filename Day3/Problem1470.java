public class Problem1470 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2 };
        int n = 2;
        int[] result = new int[nums.length];
       

        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int y = nums[i + n];
            result[2 * i] = x;
            result[2 * i + 1] = y;
            System.out.print(x);  
            System.out.print(","+y);
        }
        
    }
}

