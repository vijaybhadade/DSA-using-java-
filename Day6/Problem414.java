package Day6;

public class Problem414 {
    public static void main(String[] args) {
        int [] nums={1,2,3};
        int n=nums.length;
        int k=2;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==nums[k])
            {
                System.out.println(nums[i]);
               
            }
            else{
                System.out.print(nums[i-1]);
                
            }
        }
    }
}
