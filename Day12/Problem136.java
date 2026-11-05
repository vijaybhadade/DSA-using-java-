package Day12;

public class Problem136 {
    public static void main(String[] args) {
        int[] nums = { 2,2,1};
        
        int count=0;
        for(int i=0;i<nums.length;i++)
            { count^=nums[i];
            }  
        System.out.println(count);
    }

}
