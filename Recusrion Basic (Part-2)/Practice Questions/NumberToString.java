
public class NumberToString {

    static String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void getString(int n) {
        if (n == 0) {
            return;
        }
        int digit = n % 10;
        getString(n / 10);
        System.out.print(word[digit] + "  ");  // this is for reverse print 

    }

    public static void main(String[] args) {
        int n = 1940;
        getString(n);

    }
}
