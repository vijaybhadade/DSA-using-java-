public class smallNum {
    public static int MinNumber(int[] number) {
        int Minimum=Integer.MAX_VALUE;//+infinity

        for(int i=0;i<number.length;i++)
        {
            if( Minimum>number[i])
            {
                 Minimum=number[i];
            }
        }
         return  Minimum;
    }
    public static void main(String[] args) {
        int[] number={45,455,67,34,767,12,65,3,75,33};
        System.out.println("Minimum number of array is:"+ MinNumber(number));
    }
    
}
