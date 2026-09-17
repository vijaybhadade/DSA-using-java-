public class LargerAndSmallerFind {
    public  static  void  main(String[]args)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        int arr[]={12,43,54,63,65,24,543};

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max=arr[i];
            }

        }
        System.out.println("Largest element in array is ="+max);
        
         for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                min=arr[i];
            }

        }
        System.out.println("Smallest element in array is ="+min);

    }
}
