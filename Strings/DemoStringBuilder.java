
public class DemoStringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println("The length of StringBuilder is:" + sb.length());
    }
}
