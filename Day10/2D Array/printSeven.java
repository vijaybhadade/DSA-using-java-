
public class printSeven {

    public static int calculateSeven(int[][] arr, int key) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    tp++;
                }
            }
        }
        return tp;
    }

    public static int printSum(int[][] arr) {

        int sum = 0;
        int row = 1;
        for (int i = 0; i < arr[row].length; i++) {
            sum += arr[row][i];
        }
        return sum;
    }

    public static int[][] transposeArr(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] arr = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int[][] matrix = {{11, 12, 13}, {21, 22, 23}};
        int[][] ans = transposeArr(matrix);
        for (int[] row : ans) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
