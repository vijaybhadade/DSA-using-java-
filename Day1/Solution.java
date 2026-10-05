import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        BigInteger minByte = BigInteger.valueOf(Byte.MIN_VALUE);
        BigInteger maxByte = BigInteger.valueOf(Byte.MAX_VALUE);

        BigInteger minShort = BigInteger.valueOf(Short.MIN_VALUE);
        BigInteger maxShort = BigInteger.valueOf(Short.MAX_VALUE);

        BigInteger minInt = BigInteger.valueOf(Integer.MIN_VALUE);
        BigInteger maxInt = BigInteger.valueOf(Integer.MAX_VALUE);

        BigInteger minLong = BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            BigInteger n = sc.nextBigInteger();

            boolean fitsByte =
                    n.compareTo(minByte) >= 0 &&
                    n.compareTo(maxByte) <= 0;

            boolean fitsShort =
                    n.compareTo(minShort) >= 0 &&
                    n.compareTo(maxShort) <= 0;

            boolean fitsInt =
                    n.compareTo(minInt) >= 0 &&
                    n.compareTo(maxInt) <= 0;

            boolean fitsLong =
                    n.compareTo(minLong) >= 0 &&
                    n.compareTo(maxLong) <= 0;

            if (fitsByte || fitsShort || fitsInt || fitsLong) {

                System.out.println(n + " can be fitted in:");

                if (fitsByte)
                    System.out.println("* byte");

                if (fitsShort)
                    System.out.println("* short");

                if (fitsInt)
                    System.out.println("* int");

                if (fitsLong)
                    System.out.println("* long");

            } else {

                System.out.println(n + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }
}