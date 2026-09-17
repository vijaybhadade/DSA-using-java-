public class evenOddCount {
    public  static void main(String []args)
    {
        int odd=0;
        int even=0;
        int arr[]={10,23,54,123,53,28,90};

        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]%2==0)
          {
            even++;
          }else{
            odd++;
          }
        }
        System.out.println("Odd count is ="+odd);
        System.out.println("Even count is ="+even);
    }
}
