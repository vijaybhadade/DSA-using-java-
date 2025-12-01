
public class Array {

    public static void update(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = {45, 55, 67};
        update(marks);
        System.out.println("These are updated values in array by +1:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println();
    }
}
