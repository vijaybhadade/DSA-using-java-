public class pattern5 {
    public static void main(String[] args) {
         // start from 1 to 5
        for (int i = 1; i <= 5; i++) {  
                 
            //print space 
            for(int space=i;space>1;space--)
            {
                System.out.print(" ");
            }
            // print from current i to 5
            for (int j = i; j <= 5; j++) {    
                System.out.print(j);
            }
             // new line after each row
            System.out.println();             
        }
    }
}
