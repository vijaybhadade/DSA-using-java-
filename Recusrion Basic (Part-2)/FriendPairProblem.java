
public class FriendPairProblem {

    public static int getPair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // single                   paired
        return getPair(n - 1) + (n - 1) * getPair(n - 2);
    }

    public static void main(String[] args) {
        int result = getPair(5);
        System.out.println(" Total number of ways to  single and paired is = " + result);
    }
}
