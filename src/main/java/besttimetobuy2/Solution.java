package besttimetobuy2;

public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int current = -1;
        for(int i=0; i<prices.length - 1; i++) {
            if(current == -1) {
                if(prices[i+1] > prices[i]) { //time to buy !
                    current = prices[i];
                }
            } else {
                if( prices[i] > prices[i+1] ) {//time to sell !
                    profit += prices[i] - current;
                    current = -1;
                }
            }
        }
        if(current != -1) {
            profit += prices[prices.length - 1] - current;
        }
        return profit;
    }
}
