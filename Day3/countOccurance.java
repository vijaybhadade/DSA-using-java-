public class countOccurance {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 20, 40, 20, 50, 20 };
        int target = 20;
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                System.out.println(target + " found at index " + i);
                count++;
            }
        }
        System.out.println(target+" occurs "+count+" times ");
    }
}
