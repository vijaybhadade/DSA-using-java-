
public class powerOfNum {

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int x = power(a, n / 2);
        int halfPower = x * x;
        if (n % 2 != 0) { //odd number 
            return a * halfPower;
        }
        return halfPower;
    }

    public static void main(String[] args) {
        int result = power(2, 10);
        System.out.println(" 2 Power of 10 is = " + result);
    }
}
