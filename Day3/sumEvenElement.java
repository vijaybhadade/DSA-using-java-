public class sumEvenElement {
    public static  void main(String []args)
    {
        int arr[] = {10, 5, 20, 8, 15, 3};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                sum+=arr[i];
            }
        }
        System.out.println("Sum of even number is = "+sum);
    }
}
