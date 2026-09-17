public class frequncyElement {
    public static  void main(String[]args)
    {
        int arr[]={12,43,54,10,45,10,43,54,10};
        int count=0;
        int target=10;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                count++;
            }
        }
        System.out.println("10 occurs "+count+"  times");
    }
}
