
package Day1;

class smallestNumber {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 12, 1, 6 };

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
           
                if(arr[i]<min)
                {
                    min=arr[i];
                }
            
        }
        System.out.println(min);
    }
}