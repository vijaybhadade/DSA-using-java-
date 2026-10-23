public class Problem1672 {
    public static void main(String[] args) {
        int [][] account={{1,2,3},{4,5,3}};
        int max = 0;
        for(int i=0;i<account.length;i++)
        {
            int wealth=0;
            for(int j=0;j<account[i].length;j++)
            {
                wealth+=account[i][j];
            }
            max=Math.max(max,wealth);
        }
        System.out.println(max);
    }
}
