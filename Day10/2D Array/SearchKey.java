
public class SearchKey {

    public static boolean getSearch(int[][] matrix, int key) {
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (matrix[i][j] == key) {
        //             return "Found at (" + i + "," + j + ")";
        //         }
        //     }
        // }
        // return "not fouond";

        //this is Secound way 
        // int row = 0, col = matrix[0].length - 1;
        // while (row < matrix.length && col >= 0) {
        //     if (matrix[row][col] == key) {
        //         System.out.print("key is found at (" + row + "," + col + ")");
        //         return true;
        //     } else if (matrix[row][col] > key) {
        //         col--;
        //     } else {
        //         row++;
        //     }
        // }
        int row = matrix.length - 1, col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.print("key is found at (" + row + "," + col + ")");
                return true;
            } else if (matrix[row][col] < key) {
                col++;
            } else {
                row--;
            }
        }

        System.out.println(" key does not found!");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40},
        {15, 25, 35, 45},
        {27, 29, 37, 48},
        {32, 33, 39, 50}};
        int key = 30;
        // String result = getSearch(matrix, 45);
        getSearch(matrix, key);
    }
}
