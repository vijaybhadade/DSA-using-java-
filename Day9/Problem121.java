package Day9;



public class Problem121 {
    public static void main(String[] args) {
        int[] nums = { 7,1,5,3,6,4 };
        int MaxProfit = 0;
        int minProfit=nums[0];
        int profit = 0;
        for (int i = 0; i < nums.length; i++) {
                profit = nums[i]-minProfit;
                 
                if(nums[i] < minProfit)
                {
                    minProfit=nums[i];
                }

                if (profit > MaxProfit) {
                    MaxProfit = profit;
                }
            
        }
        System.out.println(MaxProfit);

    }
}
