package Day5;

public class Problem27 {
    public static void main(String[] args) {
        int [] nums={0,1,2,3,4,5};
        int val=2;
        int k=0;
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
          if(nums[i]!=val)
          {
            nums[k]=nums[i];
            k++;
          }
        }
    System.out.println("k="+k);
    }
}
