package Day7;

public class Problem169 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        int n = nums.length;
        int m = n / 2;
        int count = 0;
        int    candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        if (count > m) {
            System.out.println(candidate);
        }

    }
}
