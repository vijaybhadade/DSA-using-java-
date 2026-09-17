public class findSecondOCurrance {
    public static void main(String[] arf) {
        int arr[] = { 10, 20, 30, 20, 40, 20, 50 };
        int target = 20;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {

                count++;

                if (count == 2) {
                    System.out.print("Second occurance of " + target + " is = " + i);
                    break;
                }
            }
        }
    }
}
