
import java.util.*;

public class checkPalidrom {

    public static boolean printPalindrom(String name) {
        int n = name.length();
        for (int i = 0; i < name.length() / 2; i++) {

            if (name.charAt(i) != name.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string to check palindrom or not");
        String name = sc.nextLine();
        boolean result = printPalindrom(name);
        if (result == false) {
            System.out.print(name + " is not palindrom ");
        } else {
            System.out.println(name + " is palindrom");
        }
        sc.close();
    }
}
