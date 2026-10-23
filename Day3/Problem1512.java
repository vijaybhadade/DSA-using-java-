public class Problem1512 {
    public static void  main(String[] args) {
        int[] nums={1,2,3};
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j] &&  i < j)
                {
                    count++;
                }
            }
        }
        System.out.print(count);

    }
}
