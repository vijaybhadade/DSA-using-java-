
public class isPowerTwo {

    public static void main(String[] args) {
        int n = 25;
        if ((n & (n - 1)) == 0) {
            System.out.println("given number is power of 2");
        } else {
            System.out.println("Given number is not power of 2");
        }
    }
}
