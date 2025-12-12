
class PrintNum {

    public static void getDec(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }

        System.out.print(n + " ");

        getDec(n - 1);

    }
    // print number in increasing order

    public static void getIn(int n) {

        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        getIn(n - 1);
        System.out.print(n + " ");

    }

    // calculate factorial of 5 
    public static int GetFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * GetFact(n - 1);
    }

    //Sum of n natural numbers
    public static int sumOfNum(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        return n + sumOfNum(n - 1);
    }

    public static void main(String[] args) {
        int result = sumOfNum(5);
        System.out.println(result);
    }
}
