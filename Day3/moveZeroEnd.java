public class moveZeroEnd {
    public  static  void main(String []args)
    {
        int arr[] = {0, 1, 0, 3, 12};
        int position=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] ==0)
            {
               int temp=arr[i];
               arr[i]=arr[position];
               arr[position]=temp;
               position++;
            }
        }
        //print array
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
