public class countLessThanValue {
    public  static  void main(String[]args)
    {
        int arr[] = { 10, 5, 20, 8, 15, 3 };
        int target = 10;
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < target)
            {
                count++;
            }
        }
        System.out.println("Count numbers less than a given value = "+ count);
    }
}
