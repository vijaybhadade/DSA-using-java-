import java.util.Arrays;

public class Problem344 {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        int n = s.length;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }

        System.out.println(Arrays.toString(s));

    }
}
