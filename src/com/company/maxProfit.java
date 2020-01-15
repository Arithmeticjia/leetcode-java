package com.company;

public class maxProfit {

    public static void main(String[] args){
        maxProfit test = new maxProfit();
        int[] t = {7,1,5,3,6,4};
        System.out.println(test.maxProfit(t));
    }


    public int maxProfit(int[] prices){
        if(prices.length == 0)
            return 0;
        int maxprofit = 0;
        int buy= prices[0];
        for(int i = 0; i < prices.length;i++){
            if (prices[i] < buy)
                buy = prices[i];
            else {
                int profit = prices[i] - buy;
                if(profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }
}
