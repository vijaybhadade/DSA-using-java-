
public class PrintNumberDec {

    public static void printDec(int n) {
        if (n == 1) {  // base recursion
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void main(String[] args) {
        printDec(10);
    }
}
