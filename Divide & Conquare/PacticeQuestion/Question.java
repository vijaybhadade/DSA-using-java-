package PacticeQuestion;

public class Question {

    public static void printArr(String[] planets) {
        for (String planet : planets) {
            System.out.print(planet + " ");
        }
        System.out.println();
    }

    public static void mergeSort(String planets[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;

        mergeSort(planets, si, mid);
        mergeSort(planets, mid + 1, ei);

        merge(planets, si, mid, ei);

    }

    public static void merge(String planets[], int si, int mid, int ei) {
        String[] temp = new String[ei - si + 1];
        int i = si; //left part of index
        int j = mid + 1; //right part of index 
        int k = 0; //index of tempory 

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

        while (i <= mid) {
            temp[k] = planets[i];
            k++;
            i++;
        }
        while (j <= ei) {
            temp[k] = planets[j];
            k++;
            j++;
        }

        //copy tempory arry to original array 
        for (k = 0, i = si; k < temp.length - 1; k++, i++) {
            planets[i] = temp[k];

        }
    }

    public static void main(String[] args) {
        String[] planets = {"sun", "earth", "mars", "marcury"};
        mergeSort(planets, 0, planets.length - 1);
        printArr(planets);
    }
}
