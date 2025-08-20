public class SellStock {
    public static int Solution(int[] stock) {
        int BuyPrice=Integer.MAX_VALUE;
        int maxPrice=0;

        //loop for search all stocks
        for(int i=0;i<stock.length;i++)
        {
            
            if(BuyPrice <stock[i])
            {
           int Profit=stock[i]-BuyPrice;
           maxPrice=Math.max(maxPrice, Profit);
            }
            else{
                BuyPrice=stock[i];
            }
        }
        return maxPrice;
    }
    public static void main(String[] args) {
        int[] stock={7,1,5,3,6,4};
        System.out.println("maxProfit on:    "+Solution(stock));
    }
}
