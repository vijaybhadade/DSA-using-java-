public class countPoNiZe {
    public  static  void main(String[]args)
    {
        int pcount=0;
        int ncount=0;
        int zcount=0;
        int arr[] = {10, -5, 0, 20, -10, 0, 30};

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < 0)
            {
                ncount++;
            }
            else if(arr[i] > 0)
            {
                pcount++;
            }else 
            {
                zcount++;
            }
        }
        System.out.println("Positive = "+pcount);
        System.out.println("Negative = "+ncount);
        System.out.println("Zero = "+zcount);
    }
}
