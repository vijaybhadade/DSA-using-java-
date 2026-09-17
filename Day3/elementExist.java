public class elementExist {
    public  static  void  main(String[]args)
    {
        int arr[] = {10, 20, 30, 40, 50};
        int target=30;
        boolean isFound=false;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {   
                isFound=true;
                break;
            }
            
        }
        if(isFound)
        {
            
          System.out.println("Element  found!");
          
        }
        else{
            System.out.println("Element not  found!");

        }
       
    }
}
