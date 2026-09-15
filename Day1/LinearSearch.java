public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 7, 23, 89, 34 };
        int target = 100;
        boolean found=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
               System.out.print("Element found at index "+i);
               found=true;
               break;
            }   
        }
          if(!found)
          {
            System.out.print("Given number does not exit in array"+ target);
          }
    }
}
