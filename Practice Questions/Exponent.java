
public class Exponent {

    public static int getNum(int x, int n) {

        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        int half = getNum(x, n / 2);
        //check if n is even 
        if (n % 2 == 0) {
            return half * half;
        }
        //check  if n is odd then execute 
        return x * half * half;

    }

    public static void main(String[] args) {
        int result = getNum(2, 12);
        System.out.println(" 2 power of 10 is = " + result);
    }
}
