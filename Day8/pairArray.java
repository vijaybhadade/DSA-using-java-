
public class pairArray {

    public static int getPair(int[] pair) {
        int tp = 0;
        for (int i = 0; i < pair.length; i++) {
            int curr = pair[i];
            for (int j = i + 1; j < pair.length; j++) {
                System.out.println("(" + curr + "," + pair[j] + ")");

                tp++;
            }
        }
        return tp;

    }

    public static void main(String[] args) {
        int pair[] = {2, 4, 6, 8, 10};
        System.out.println("Total pair of number are following:");
        getPair(pair);
    }
}
