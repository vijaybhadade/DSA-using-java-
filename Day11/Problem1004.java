package Day11;



public class Problem1004 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,1};
        int n = nums.length;
        int k = 4;
        int left=0;
        int zeroCount=0;
        int maxLength=0;

        for(int right=0;right<n;right++)
        {
            if(nums[right]==0)
            {
                zeroCount++;
            }

            while(zeroCount > k)
            {
              if(nums[left]==0)
              {
                zeroCount--;
              }
              left++;
            }
            //calculate current windows length 
            int currentLength=right-left+1;

            //update maxLength
            maxLength=Math.max(maxLength,currentLength);
        }
        System.out.println(maxLength);
    }
}
