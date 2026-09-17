public class SecondLargest {
    public  static  void main(String[]args)
    {
        int arr[]={10,20,30,40,50};
        int largest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > largest)
            {
                SecondLargest=largest; //old larger number add into secondLargest
                largest=arr[i];
            }
            else if(arr[i] > SecondLargest && arr[i]!=largest)
            {
                SecondLargest=arr[i];
            }
        }
        System.out.println("Largest values is "+largest);
        System.out.println("Second-largest value is "+SecondLargest);
    }
}
