
class Solution {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Changed to print() for better formatting
        }
        System.out.println();
    }

    public static void margSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        margSort(arr, si, mid);     // Sort 1st part
        margSort(arr, mid + 1, ei); // Sort 2nd part

        marg(arr, si, mid, ei);     // Merge sorted arrays
    }

    public static void marg(int[] arr, int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // starting idx for 1st array 
        int j = mid + 1; // starting idx for 2nd array
        int k = 0; // idx of temporary array 

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // remaining elements of 1st half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // remaining elements of 2nd half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // * Copy temp array back to the original array 
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        margSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
