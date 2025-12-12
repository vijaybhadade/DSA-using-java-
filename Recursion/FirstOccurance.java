
public class FirstOccurance {

    public static int findIndex(int[] arr, int key, int i) {
        int count = 0;
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            count++;
            return i;
        }
        return count + findIndex(arr, key, i + 1);

    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 6, 2, 6, 8, 7, 12};
        int result = findIndex(arr, 2, 0);
        if (result == -1) {
            System.out.println("given key does not exist in array");
        } else {
            System.out.println("given element exist index of = " + result);
        }
    }
}
