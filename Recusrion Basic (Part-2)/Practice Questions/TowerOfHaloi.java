
public class TowerOfHaloi {

    public static void getOrdered(int n, String src, String helper, String desk) {
        if (n == 1) {
            System.out.println("transfer desk" + n + " from " + src + " to " + desk);
            return;
        }

        //transfer top n-1  from src to  helper  using desk  as 'helper'
        getOrdered(n - 1, src, helper, desk);

        //transfer nth from src to  desk
        System.out.println(" transfer desk " + n + "from" + src + "to" + helper);

        //transfer  n-1 from  helper  to desk  using  src  as 'helper'
        getOrdered(n - 1, src, helper, desk);
    }

    public static void main(String[] args) {
        int n = 4;
        getOrdered(n, "A", "B", "C");
    }
}
