class LinearSeach{
    public static void main(String[] args) {
        int []arr = {5, 8, 5, 2, 5, 9};
        int target=5;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
               count++;
                
            }
        }
         System.out.println(count);

    }
}