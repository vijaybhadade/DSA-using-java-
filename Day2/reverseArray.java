import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 60, 30, 40, 20};
        int end=arr.length-1;
       int start=0;
       
          while(start<end)
          {
           
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
          
          }
      System.out.println(Arrays.toString(arr));
        
    }
}
