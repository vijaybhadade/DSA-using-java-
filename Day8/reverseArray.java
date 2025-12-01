
public class reverseArray {

    public static void main(String[] args) {
        int num[] = {23, 44, 12, 54, 65};
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
        for (int n : num) {
            System.out.print(n + " ");
        }
    }

}
