
public class BinaryStringProblem {

    public static void isSize(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // choice 1: add 0
        isSize(n - 1, 0, str + "0");

        // choice 2: add 1 (only if last place was 0)
        if (lastPlace == 0) {
            isSize(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        isSize(3, 0, "");
    }
}
