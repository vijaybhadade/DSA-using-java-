
public class FindSubset {

    public static void getSubsets(String str, String ans, int i) {
        //base 
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // Yes choices
        getSubsets(str, ans + str.charAt(i), i + 1);
        //No choices
        getSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        getSubsets(str, "", 0);

    }
}
