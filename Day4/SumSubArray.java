//this is sum of subarray solve using (brute Force)

public class SumSubArray{
    public static void Solution(int[] num) {
      int max_sum=Integer.MIN_VALUE;//-infinity
      int currSum;
      for(int i=0;i<num.length;i++)
      {
        int start=i;
        for(int j=i;j<num.length;j++)
        {
            int end=j;
            currSum=0;
            for(int k=start;k<end;k++)
            {
                currSum=currSum+num[k];
            }
            System.out.println(currSum);
            if(max_sum<currSum)
            {
                max_sum=currSum;
            }
            
        }
      }
      System.out.println("max sum of number in array: "+max_sum);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        Solution(num);
    }
}