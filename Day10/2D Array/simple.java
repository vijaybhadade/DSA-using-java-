
import java.util.*;

public class simple {

    public static boolean findIndexOfElement(int[][] matrix, int key) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("(" + i + "," + j + ")");
                    return true;
                }
            }

        }
        System.out.print("Given key does not match in matrix:");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter values in array:");
        try {

            int n = 3;
            int m = 3;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("These are following values of matrix:");
            //print output 
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception err) {
            System.out.println("Something is problem in code.Please re-check" + err);
        }
        findIndexOfElement(matrix, 56);
        sc.close();

    }
}
