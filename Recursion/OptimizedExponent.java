
public class OptimizedExponent {

    public static int OptimizeCode(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        int halfPower = OptimizeCode(x, n / 2);

        // check if n is even  then code run 
        if (n % 2 == 0) {
            return halfPower * halfPower;
        }// check is n is odd then return result
        return x * halfPower * halfPower;
    }

    public static void main(String[] args) {
        int result = OptimizeCode(2, 10);
        System.out.println(" 2 power of 10 is =" + result);
    }
}
