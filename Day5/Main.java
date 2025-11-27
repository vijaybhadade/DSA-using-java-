
import java.util.Scanner;

class Main{
    public static boolean  isEven(int num){

   return num %2==0;
    }
    public static void main(String [] args)
    {
     Scanner sc= new Scanner(System.in);

     System.out.println("Enter any number:");
     try {
          int num= sc.nextInt();
     
     if(isEven(num))
     {
        System.out.println(" is even.");
     }
     else
     {
        System.out.println("is odd.");
     }
     } catch (Exception e) {
        System.out.println("Invalide input! enter only interger value");
     }
    
     sc.close();
    }

}