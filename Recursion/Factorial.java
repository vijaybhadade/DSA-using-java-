
public class Factorial {

    static int printFactorial(int n) {
        if (n == 0 || n == 1) {

            return 1;
        }
        return n * printFactorial(n - 1);
    }

    public static void main(String[] args) {
        int result = printFactorial(5);
        System.out.println("Factorial of " + 5 + " is " + result);
    }
}
