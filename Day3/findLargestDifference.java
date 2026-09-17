    public class findLargestDifference {
        public  static  void main(String[]args)
        {
            int arr[] = {10, 3, 15, 7, 2};
            int largest=Integer.MIN_VALUE;
            int smallest=Integer.MAX_VALUE;

            for(int i=0;i<arr.length;i++)
            {
                if(arr[i] > largest)
                {
                    largest=arr[i];
                }
                if(arr[i] < smallest)
                {
                    smallest=arr[i];
                }
            }
            int difference=largest-smallest;
            System.out.println("the largest difference between two elements = "+difference);
        }
    }
