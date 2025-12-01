
public class binarySearch2 {

    public static int getNumbers(int[] num, int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;
            } else if (num[mid] > key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {90, 87, 76, 67, 56, 45, 34, 22, 12};
        int key = 12;
        int result = getNumbers(num, key);
        if (result == -1) {
            System.out.println("Given number does not exist in array");
        } else {
            System.out.println("index of given number is = " + result);
        }

    }
}
