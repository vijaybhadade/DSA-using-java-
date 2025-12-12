
public class PrintNThNumber {

    //check element on first occurance 
    public static int FirstOccu(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return FirstOccu(arr, key, i + 1);
    }
    //check element on last occurance 

    public static int LastOccu(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = LastOccu(arr, key, i + 1);
        if (isFound != -1) {
            return isFound;
        }
        if (arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 1, 7, 8, 4, 8, 4, 5, 9, 12, 4};
        int result = LastOccu(arr, 4, 0);
        if (result == -1) {
            System.out.println("given number  does not exist in array");
        } else {
            System.out.println("given element exist on index is = " + result);
        }
    }
}
