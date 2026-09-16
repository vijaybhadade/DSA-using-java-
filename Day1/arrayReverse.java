public class arrayReverse {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int j = arr.length - 1;
        int i = 0;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.print("Reversed array following: = ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
