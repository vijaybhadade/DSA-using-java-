public class secondSmallest {
    public  static  void main (String[] args)
    {
        int min=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        int arr[] = {40, 10, 30, 20, 50};

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
               secondSmallest=min;
               min=arr[i];
            }
            else if(arr[i] < secondSmallest && arr[i]!=min)
            {
                secondSmallest=arr[i];
            }
        }
        System.out.println("first smallest value in array is ="+min);
        System.out.println("second smallest value in array is ="+secondSmallest);
    }
}
