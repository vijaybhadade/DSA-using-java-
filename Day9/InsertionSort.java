
import java.util.Arrays;
import java.util.Collections;

public class InsertionSort {

    public static void getSorted(int[] n) {
        for (int i = 0; i < n.length; i++) {
            int curr = n[i];
            int prev = i - 1;
            //find the position of number
            while (prev >= 0 && n[prev] > curr) {
                n[prev + 1] = n[prev];
                prev--;
            }
            //insertion number in to position
            n[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        Integer n[] = {5, 4, 3, 2, 1, 6};
        Arrays.sort(n, 0, 3, Collections.reverseOrder());

        // getSorted(n);
        for (int num : n) {
            System.out.print(num + " ");
        }
    }
}
