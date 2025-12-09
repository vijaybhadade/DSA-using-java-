
public class IsOddOrEven {

    public static void OddOrEven(int n) {
        int Bitmask = 1;

        if ((n & Bitmask) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static int getIThBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIThBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIThBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    //update ith bit
    public static int updateIthBit(int n, int i, int newmask) {
        n = clearIThBit(n, i);
        int bitmask = newmask << i;
        return n | bitmask;
    }

    //Clear last ith
    public static int clearIThBits(int n, int i) {
        int Bitmask = (~0) << i;
        return n & Bitmask;
    }

    public static int ClearRangeOfBits(int i, int j, int n) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;

    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int CountSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 0) { // to change !  for count 1  otherwise count 0 into  binary number form 
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int n, int a) {
        int ans = 1;

        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= a;
            }
            a *= a;
            n = n >> 1;
        }
        return ans;
    }

    //modular exponentiation
    public static long fastModExpo(long base, long exponent, long modules) {
        long ans = 1;
        base %= modules;
        while (exponent > 0) {
            if ((exponent & 1) != 0) {
                ans = (ans * base) % modules;
            }
            base = (base * base) % modules;
            exponent = exponent >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastModExpo(7, 5, 10));
    }
}
