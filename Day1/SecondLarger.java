public class SecondLarger{
    public  static  void main(String[]args)
    {
        int arr[]={12,43,123,656,24,644,65,3};
        int largest=Integer.MIN_VALUE;
        int SecondLarger=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                SecondLarger=largest;
                largest=arr[i];
            }
            else if(arr[i]>SecondLarger)
            {
                SecondLarger=arr[i];
            }
        }
        System.out.println("Largest number in array is ="+largest);
        System.out.println("SecoundLargest number in array is ="+SecondLarger);
    }
}