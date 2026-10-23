import java.util.*;

public class Problem1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)  {

        int n = candies.length;
       List<Boolean>result= new ArrayList<>(); 
        int max = Integer.MIN_VALUE;
        // find max values
        for (int i = 0; i < n; i++) {
            if (max <= candies[i]) {
                max = candies[i];
            }
        }
        for(int i=0;i<n;i++)
        {
             result.add(candies[i]+extraCandies >=max);
        }
        return result;

    }
}
