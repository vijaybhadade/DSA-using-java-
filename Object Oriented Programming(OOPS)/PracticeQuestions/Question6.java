
import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a  & b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
