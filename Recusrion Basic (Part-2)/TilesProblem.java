
public class TilesProblem {

    public static int FindWay(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }//vertical choice for n-1 and horizantal for n-2 
        return FindWay(n - 1) + FindWay(n - 2);
    }

    public static void main(String[] args) {
        int result = FindWay(4);
        System.out.println("total way to tiles appplied is = " + result);
    }
}
