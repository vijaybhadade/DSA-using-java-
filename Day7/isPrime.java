
public class isPrime {

    public static void main(String[] args) {

        int n = 56;
        int div = 2;
        boolean flag = true; // assume prime

        while (div < n) {
            if (n % div == 0) {
                flag = false;
                break;
            }
            div++;
        }

        if (flag) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is not prime");
        }

    }
}
