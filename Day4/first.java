

public class first{
    public static void update(int[] marks) {
        
        for(int i=0;i<marks.length;i++)
        {
           marks[i]=marks[i]+1;
          
        }
    }
    public static void main(String[] args) {
        int[] marks= { 56,23,78};
       
        //call by method 
        update(marks);
        //print the marks 
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");
        } 
        System.out.println();
    }
}