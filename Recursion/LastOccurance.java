
public class LastOccurance {

    public static int FindOcuu(int[] arr, int key, int i) {
        int n = arr.length - 1;
        if (i == n) {
            return -1;
        }
        int isFound = FindOcuu(arr, key, i + 1);
        if (isFound != -1) {
            return isFound;
        }
        if (arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 8, 3, 5, 9, 3, 5};
        int result = FindOcuu(arr, 3, 0);
        if (result == -1) {
            System.out.println("given element does not exist in array");
        } else {
            System.out.println("given element exist in index of " + result);
        }
    }
}
