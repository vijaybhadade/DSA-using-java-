
public class first {

    public static void printCharecter(String str) {
        // if (str.equals(str1)) {
        //     System.out.println("these two strings are equals");
        // } else {
        //     System.out.println("these are not equlas");
        // }

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        String str = "vijay";

        printCharecter(str);
    }
}
