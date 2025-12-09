
public class PracticeQuestions {

    //find value of x^x 
    public static void valueOfX(int x) {
        int result = x ^ x;
        System.out.println(" input value (x) = " + x);
        System.out.println(" Binary of  (x) = " + Integer.toBinaryString(x));
        System.out.println(" Binary of result (x) = " + Integer.toBinaryString(result));
    }
    //swap two number without using third variable 

    public static void swapTwoNumber(int a, int b) {

        System.out.println("Before  swap: A = " + a + " and B =" + b);
        //swap using XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After  swap: A = " + a + " and B  = " + b);
    }

    public static void AddOneInteger(int n) {

        n = 6;
        System.out.println(n + " + " + 1 + " is " + -~n);
        n = -4;
        System.out.println(n + " + " + 1 + " is " + -~n);
        n = 0;
        System.out.println(n + " + " + 1 + " is " + -~n);
    }

    public static void main(String[] args) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print((char) (ch & '_') + " ");
        }

    }
}
