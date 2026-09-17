public class largestEvenElement {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 20, 8, 15, 3, 26, 12 };
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > largest) {
                largest=arr[i];
               
            }
        }
         System.out.println("Even element in array = "+largest );
    }
}
