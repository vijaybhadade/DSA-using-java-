
public class CountingSort {

    public static void getSort(int[] arr) {
        int largerst = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largerst = Math.max(largerst, arr[i]);
        }

        int count[] = new int[largerst + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting 
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 2, 3, 7, 3};
        getSort(arr);
        System.out.println("These are following sorted array:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
