import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10, 50};
        
        List<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}