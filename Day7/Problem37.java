package Day7;

public class Problem37 {
    public static void main(String[] args) {
        int [] nums={1,3,5,6};
        int target=5;
        int n=nums.length;
        int start=0;
        int end=n-1;

        while (start <= end)
        {
            int mid=end+(start-end)/2;
            if(nums[mid]==target)
            {
               System.out.println(mid);
            }else if( target < nums[mid])
            {
                start=mid+1;
            }
            else if(target > nums[mid])
            {
                end=mid-1;
            }
        }
        System.out.println(start);
        
    }
}
