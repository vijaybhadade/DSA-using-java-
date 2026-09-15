public class FindSmallest {
    public static  void main(String[]args)
    {
        int [] arr={12,43,213,63,4,64,65};
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Smallest value in array is ="+min);
    }
}
