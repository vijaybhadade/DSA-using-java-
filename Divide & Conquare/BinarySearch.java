
public class BinarySearch {

    public static int getElement(int[] arr, int key) {
        int si = 0;
        int ei = arr.length - 1;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int keyIdx = getElement(arr, 100);
        if (keyIdx == -1) {
            System.out.println("Given key does not exist in array!");
        } else {
            System.out.println("given key exist in array index of = " + keyIdx);
        }

    }
}
