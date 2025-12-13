
public class RemovesDuplication {

    public static void printString(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        //work 
        char currChar = str.charAt(idx);

        if (map[currChar - 'a'] == true) {
            //duplicate string 
            printString(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            printString(str, idx + 1, newStr, map);
        }
    }

    public static void main(String[] args) {
        String str = "vijaybhadade";
        printString(str, 0, new StringBuilder(""), new boolean[26]
        );
    }
}
