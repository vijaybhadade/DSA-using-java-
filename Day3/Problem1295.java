public class Problem1295 {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        int n = nums.length;
       
        int count = 0;
        for (int i = 0; i < n; i++) {
          int value=nums[i];
           int digit=0;
            while (value > 0) {
                 digit++;
                 value=value/10;
            }
            
            if(digit%2==0)
            {
                count++;
            }
            
        }
        System.out.println(count);

    }
}
