import java.util.Scanner;

public class forLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int query = sc.nextInt();

        for (int j = 0; j < query; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                a += b * (int) Math.pow(2, i);
                System.out.print(a + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}
