public class LinerArr {
    public static int Linear(int [] arr,int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i; // index सापडला
            }
        }
        return -1; // नसेल तर
    }

    public static void main(String[] args) {
        // Example of linear search
        int[] arr = {2,4,6,8,10,12,14};
        int key = 10;

        int index = Linear(arr, key);
        if(index == -1) {
            System.out.println("Value does not exist in array.");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
