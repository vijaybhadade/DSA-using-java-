
import java.util.Scanner;
class palidrome {
    public static boolean  isPalidrome(int num)
    {   
       int original=num;
        int sum=0;
        while(num>0)
        {
            int digit=num%10;
            sum=sum*10+digit;
            num=num/10;
        }
        return original==sum;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number:");
        try {
             int num= sc.nextInt();

         if(isPalidrome(num))
         {
            System.out.println(num+"Enter number is palidrome");
         }
         else{
            System.out.println(num+"Enter number is not palidrome");
         }
        } catch (Exception e) {
            System.err.println("Enter only interger values..");
        }
        
         sc.close();
    }
}