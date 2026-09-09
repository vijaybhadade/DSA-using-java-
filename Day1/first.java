
import java.util.InputMismatchException;
import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try{
               
                 System.out.println("Enter any number");
            int n = sc.nextInt();
           if(n > 0)
           {
            System.out.println("Given number is positive ");
           }
           else if(n < 0)
           {
            System.out.println("Given number is negative");
           }
           else {
            System.out.println("Please enter valid number!");
           }
            }catch(InputMismatchException e)
            {
                System.out.println("Enter only interger values");
            }
           
        }
    }

}
