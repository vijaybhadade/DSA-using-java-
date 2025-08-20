public class BinarySearch {
    public static int Solution (int[] number,int key)
    {
        int start=0, end=number.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(number[mid]==key)
            {
                return mid;
            }
             else if(number[mid]<key)
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
           
        }
         return -1;
    }
    public static void main(String[] args) {
        int[] number={12, 23, 43, 54, 64, 77, 122, 223, 233, 343, 6442};
        int key=122;
        int result=Solution(number, key);
        if(result==-1)
        {
            System.out.println("Searching key is not existing in array:");
        }
        else{
        System.out.println("index of key is:"+result);
        }
        
    }
}
