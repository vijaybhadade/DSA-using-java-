
public class Exponent {

    public static int Calculate(int x, int n) {
        if (n == 1) {
            return x;
        }
        if (n == 0) {
            return 1;
        }

        return x * Calculate(x, n - 1);

    }

    public static void main(String[] args) {
        int result = Calculate(2, 10);
        System.out.println("Number  2 power of  10  is = " + result);

    }
}
