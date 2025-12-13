
public class FindStringLength {

    public static int getLength(String str, int idx) {

        if (idx == str.length()) {
            return 0;
        }

        return 1 + getLength(str, idx + 1);
    }

    public static void main(String[] args) {
        String str = "vijay";
        System.out.println("Length of given string is = " + getLength(str, 0));
    }
}
