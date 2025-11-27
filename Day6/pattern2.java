

public class pattern2 {
  public static void main(String[] args) {
      int i;
      int x;
      int j;
      for(i=1;i<=5;i++)
      {
        for(x=5;x > i;x--)
        {
            System.out.print(" ");
        }
        for(j=i;j>=1;j--)
        {
            System.out.print(j);
        }
        System.out.println(" ");
      }
  }
}
