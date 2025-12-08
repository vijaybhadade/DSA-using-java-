
import java.util.Arrays;

public class anagrams {

    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";

        // convert both to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // first check length is same
        if (str1.length() == str2.length()) {

            // convert strings into char arrays
            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();

            // sort both char arrays
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            // compare sorted arrays
            boolean result = Arrays.equals(str1Array, str2Array);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are NOT anagrams.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT anagrams (length mismatch).");
        }
    }
}
