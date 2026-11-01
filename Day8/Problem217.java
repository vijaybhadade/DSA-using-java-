package Day8;

import java.util.HashSet;

public class Problem217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash= new HashSet<>();

        for(int num:nums)
        {
            if(hash.contains(num))
            {
                return true;
            }
            else{
                hash.add(num);
            }
          
        }
        return  false;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,1};
      boolean result=Problem217.containsDuplicate(nums);
      System.out.println(result);
    }
}
