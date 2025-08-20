public class MaxOfSubArray {
    public static void Solution(int[] number) {
        int ms=Integer.MIN_VALUE;//-infinity 
        int cs=0;

        //for loop to check current value and add them ms
        for(int i=0;i<number.length;i++)
        {
            cs=cs+number[i];
            if(cs<0)
            {
                cs=-1;
            }
           
            if(cs>ms)
            {
                ms=cs;
            }
        }
        System.out.println("max sum in subarray is:"+ms);
    }
    public static void main(String[] args) {
        int[] number={-2,-3,4,-1,-2,1,5,-3};
        Solution(number);
    }
}
