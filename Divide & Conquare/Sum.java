//find the sum of n numbers

public class Sum {

    public static int fib(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = fib(20);
        System.out.println(" sum of 20 numbers is = " + result);
    }
}
