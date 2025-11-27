
public class maxOfThree {

    public static void main(String[] args) {
        int a = 54;
        int b = 22;
        int c = 12;
        if (a > b || a > c) {
            System.out.println("a=" + a);
        } else if (b > c || b > a) {
            System.out.println("b=" + b);
        } else {
            System.out.println("c=" + c);
        }
    }
}
