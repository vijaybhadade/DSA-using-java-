
public class simple {

    // public static int getLargest(int[] arr) {
    //     int max = arr[0];
    //     for (int i = 1; i < arr.length; i++) {
    //         if (arr[i] > max) {
    //             max = arr[i];
    //         }
    //     }
    //     return max;
    // }
    public static int getSmallest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void getReverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }

    public static int getSecoundLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secoundmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secoundmax = max;
                max = arr[i];
            } else if (arr[i] > secoundmax && arr[i] != max) {
                secoundmax = arr[i];
            }
        }
        return secoundmax;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 4};
        // getSmallest(arr);
        // int result = getSmallest(arr);
        // System.out.println("Smallest number in array is " + result);

        // getReverse(arr);
        // System.out.println("following reverse array");
        // for (int i : arr) {
        //     System.out.print(i + "  ");
        // }
        int result = getSecoundLargest(arr);
        System.out.println("get secound largest number is " + result);
    }
}
