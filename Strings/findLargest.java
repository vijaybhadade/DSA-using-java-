public class findLargest {

    public static String getFruits(String[] food) {
        String largest = food[0];
        for(int i = 1; i < food.length; i++) {
            if (largest.compareTo(food[i]) < 0) {
                largest = food[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String[] food = {"apple", "banana", "mongo"};
        System.out.println(getFruits(food));
    }
}
