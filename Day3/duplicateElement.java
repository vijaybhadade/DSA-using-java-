import java.util.Arrays;

public class duplicateElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 20, 40, 10, 10, 50, 40};

        Arrays.sort(arr); // Array becomes: [10, 10, 10, 20, 20, 30, 40, 40, 50]

        System.out.println("Duplicate values are: ");
        for (int i = 0; i < arr.length - 1; i++) {
            
            if (arr[i] == arr[i + 1]) {
               
                if (i == 0 || arr[i] != arr[i - 1]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}