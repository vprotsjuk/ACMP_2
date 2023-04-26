public class leetCode_121 {
    public static void main(String[] args) {
        int [] prices = {6, 2, 3, 4, 1, 6};
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] < min){
                min = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }
        System.out.println(maxProfit);
    }
}
