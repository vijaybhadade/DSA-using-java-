
public class Fabonacci {

    static int totalCalled = 0;

    static int returnFabo(int n) {
        totalCalled++;
        if (n == 0 || n == 1) {
            return n;
        }

        return returnFabo(n - 1) + returnFabo(n - 2);

    }

    public static void main(String[] args) {

        System.out.println("Fabonacci of 14 is = " + returnFabo(14));
        System.out.println(" total number if called = " + totalCalled);
    }
}
