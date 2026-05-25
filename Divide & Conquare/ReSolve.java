
public class ReSolve {

    public static int getElement(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num1 = {2, 1, 2};
        System.out.println("MajorElement of  given array " + getElement(num1));
        int[] num2 = {3, 3, 3, 1, 2};
        System.out.println("MajorElement of  given array " + getElement(num2));
    }
}
