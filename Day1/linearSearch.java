package Day1;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 10, 25, 7, 42, 15 };
        int target = 42;
        for(int i=0;i<arr.length;i++)
        {
            if(target==arr[i])
            {
             System.out.print(i);
             break;
            }
        }
    }
}
