public class largeNum {
    public static void Find(int[] number) {
        int largest = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (minimum > number[i]) {
                minimum = number[i];
            }
        }

        System.out.println("Largest number in array is: " + largest);
        System.out.println("Minimum number in array is: " + minimum);
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 6, 3, 5};
        Find(number);
    }
}
