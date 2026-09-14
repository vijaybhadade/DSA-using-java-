
public class backTracking {

    public static void getArray(int[] arr, int i, int val) {
        //Base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        //work 
        arr[i] = val;
        getArray(arr, i + 1, val + 1);  // fnx call steps 
        arr[i] = arr[i] - 2; //backtracking 
    }

    public static void printArr(int[] arr) {
         System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + "  ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        getArray(arr, 0, 1);
        printArr(arr);
    }
}
