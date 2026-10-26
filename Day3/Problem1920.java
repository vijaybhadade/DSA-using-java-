public class Problem1920 {
public static void main(String[] args) {
    int[] nums={0, 2, 1, 5, 3, 4};
    
    System.out.print("[");
    for(int i=0;i<nums.length;i++)
    {
        nums[i]=nums[nums[i]];
        System.out.print(nums[i]);
        if(i<nums.length-1)
        {
            System.out.print(",");
        }
    }
    System.out.print("]");
}
}
