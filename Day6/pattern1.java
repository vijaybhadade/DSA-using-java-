class pattern1
{
    public static void main(String[] args)
    {
        int i;
        int j;
        int x;
        for(i=1;i<=5;i++)
        {
            //space print 
            for(x=5;x>i;x--)
            {
                System.err.print(" ");
            }
            //print number
            for(j=1;j<=i;j++)
            {
                System.err.print(j);
            }
            System.out.println("");
        }
    }
}