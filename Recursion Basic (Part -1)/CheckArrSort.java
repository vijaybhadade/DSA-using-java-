
public class CheckArrSort {

    public static boolean FindSort(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] < arr[i + 1]) {
            return false;
        }
        return FindSort(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {45, 23, 12, 11};

        System.out.println(FindSort(arr, 0));
    }
}
