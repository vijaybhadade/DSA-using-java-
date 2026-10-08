package Day1;
public class findSmallAndMax {
    public static void main(String[] args) {
        int []arr={7, 2, 9, 4, 1, 6};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }else if(arr[i]>max)
            {
                max=arr[i];
            }
           
        }
        System.out.println("Minimum:"+min);
        System.out.println("Maximum:"+max);
    }
}
