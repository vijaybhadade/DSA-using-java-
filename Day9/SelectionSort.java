
public class SelectionSort {

    public static void getSorted(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[minPos] < num[j]) {  //changing  (Deccessding ) < & > (accessding order)
                    minPos = j;
                }
            }
            int temp = num[minPos];
            num[minPos] = num[i];
            num[i] = temp;

        }
    }

    public static void main(String[] args) {
        int num[] = {1, 4, 5, 2, 3};
        getSorted(num);
        for (int n : num) {
            System.out.print(n + " ");
        }
    }
}
