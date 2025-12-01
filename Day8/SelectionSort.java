
public class SelectionSort {

    public static void getSort(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    smallest = arr[j + 1];
                }
            }
            System.out.print(smallest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        getSort(arr);
    }
}
