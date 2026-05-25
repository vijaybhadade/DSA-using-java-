
public class Example {

    public static void printArr(String[] planets) {
        for (String planet : planets) {
            System.out.print(planet + " ");
        }
        System.out.println();
    }

    public static void margeSort(String[] planets, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2; // find middle of array 
        margeSort(planets, si, mid); // sorted 1st half part 
        margeSort(planets, mid + 1, ei); // sorted 2nd half part 
        marge(planets, si, mid, ei); // marge both 1st half and 2nd half 
    }

    public static void marge(String[] planets, int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si; // idx for 1st half part 
        int j = mid + 1; //idx for 2nd half part 
        int k = 0; // idx of temporary array 

        //checking values in sorted array and re-arrange accending order 
        while (i <= mid && j <= ei) {
            if (planets[i].compareTo(planets[j]) < 0) {
                temp[k] = planets[i];
                i++;
            } else {
                temp[k] = planets[j];
                j++;
            }
            k++;
        }
        //check remaing last element in 1st half 
        while (i <= mid) {
            temp[k++] = planets[i++];
        }
        //checking remaiing last element in 2nd half 
        while (j <= ei) {
            temp[k++] = planets[j++];
        }
        //copy to element from temporary array to original array  
        for (k = 0, i = si; k < temp.length; k++, i++) {
            planets[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        String[] planets = {"sun", "earth", "mars", "mercury"};
        margeSort(planets, 0, planets.length - 1);
        printArr(planets);

    }
}
