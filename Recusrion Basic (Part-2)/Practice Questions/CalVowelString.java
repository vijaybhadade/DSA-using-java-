
public class CalVowelString {

    public static int printVowel(String str, int idx) {
        int count = 0;
        if (idx == str.length()) {
            return 0;

        }
        char ch = str.charAt(idx);
        if ('a' == ch || 'e' == ch || 'i' == ch || 'o' == ch || 'u' == ch) {
            count = 1;

        }

        return count + printVowel(str, idx + 1);
    }

    public static void main(String[] args) {
        String str = "ashiwariya";
        System.out.println("Given string vowels count is = " + printVowel(str, 0));
    }
}
