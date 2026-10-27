

public class Problem167 {
    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int n = numbers.length;
        int target = 9;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
               System.out.println("[" + (start + 1) + ", " + (end + 1) + "]");
               break;
            } else if (sum < target) {
                start++;

            } else if (sum > target) {
                end--;
            }

        }

    }
}
