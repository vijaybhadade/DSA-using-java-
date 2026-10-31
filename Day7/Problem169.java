package Day7;

public class Problem169 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
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
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3,2,2,2,2,2,2 };
        Problem169 pm = new Problem169();
        int result = pm.majorityElement(nums);
        System.out.println(result);

    }
}
