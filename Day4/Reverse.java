public class Reverse {
    public static void Solution(int[] number)
    {
        int start=0,end=number.length-1;

        while(start<end)
        {
            int temp=number[start];
            number[start]=number[end];
            number[end]=temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] number={2,4,6,8,10,12,14,16};
        Solution(number);
        for(int i=0;i<number.length;i++)
        {
            System.out.print(number[i]+" ");
        }
        System.out.println(" ");
    }
    
}
