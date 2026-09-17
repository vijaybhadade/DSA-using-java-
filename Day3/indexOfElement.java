public class indexOfElement {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int target = 40;
        boolean isfound=false;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                System.out.println("Element found at = "+i);
                isfound=true;
                break;
            }
        }
        if(!isfound)
        {
         System.out.println("Given number does not exist in array");
        }
    }
}
