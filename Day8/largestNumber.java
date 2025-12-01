
public class largestNumber {

    public static int find(int[] numbers) {
        int largest = Integer.MIN_VALUE; //- infinity 
        int smallest = Integer.MAX_VALUE; // + infinity
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];

            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value in array is  = " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 4, 63, 6, 3, 45};

        int result = find(numbers);
        System.out.println("largest numebers in array is = " + result);
    }
}
