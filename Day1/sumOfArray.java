public class sumOfArray {
   public  static  void main(String[] args)
   {
    int even=0;
    int odd=0;
    int[] arr = {10, 15, 22, 7, 18, 31, 40};
    for(int i=0;i<arr.length;i++)
    {
       if(arr[i]%2==0)
       {
        even++;
       }
       else{
        odd++;
       }
    }
    System.out.println("Even = "+even);
    System.out.println("Odd  = "+odd);
   } 
}
