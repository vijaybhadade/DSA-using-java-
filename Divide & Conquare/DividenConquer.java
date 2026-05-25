
public class DividenConquer {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //margeSorting 
    public static void margeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2; // find middle of array 
        margeSort(arr, si, mid); // sorted 1st half part 
        margeSort(arr, mid + 1, ei); // sorted 2nd half part 
        marge(arr, si, mid, ei); // marge both 1st half and 2nd half 
    }

    public static void marge(int[] arr, int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // idx for 1st half part 
        int j = mid + 1; //idx for 2nd half part 
        int k = 0; // idx of temporary array 

        //checking values in sorted array and re-arrange accending order 
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
        //check remaing last element in 1st half 
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        //checking remaiing last element in 2nd half 
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        //copy to element from temporary array to original array  
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    //QuickSorting 
    public static void quickSort(int[] arr, int si, int ei) {
        //Base case
        if (si > ei) {
            return;
        }
        int pIdx = patition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);// make partition left side 
        quickSort(arr, pIdx + 1, ei);// make partition right side 
    }

    public static int patition(int arr[], int si, int ei) {
        int pivote = arr[ei];
        int i = si - 1; // to make place for small element than pivote
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivote) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivote;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static int searchSort(int[] arr, int tar, int si, int ei) {
        // Base case: If search space  is exhausted and element not found 
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2; //(ei-si)/2

        // Case Found:always check mid first 
        if (arr[mid] == tar) {
            return mid;
        }
        //case1: Mid lies on line 1(left part is sorted)
        if (arr[si] <= arr[mid]) {
            //Condition A: target lies within the sorted  left part 
            if (arr[si] <= tar && tar <= arr[mid]) {
                return searchSort(arr, tar, si, mid - 1);
            } else {
                //Candition B:target lies with the sorted right part 
                return searchSort(arr, tar, mid + 1, ei);
            }
        } //Mid of L2
        else {
            //Case c: check values exist in left of L2 line
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return searchSort(arr, tar, mid + 1, ei);
            } else {
                return searchSort(arr, tar, si, mid - 1);
            }
        }

    }

    public static void main(String[] args) {
        // int[] arr = {6, 3, 2, 8, 5, 9};
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 9; // output 4
        int tarIdx = searchSort(arr, target, 0, arr.length - 1);
        if (tarIdx == -1) {
            System.out.println("Given value does not exist in array = " + target);
        } else {
            System.out.println("Index of given number is = " + tarIdx);
        }

    }
}
