package com.company;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class maxProfitII {

    public static void main(String[] args){
        maxProfitII test = new maxProfitII();
        int[] t = {7,1,5,3,6,4};
        System.out.println(test.maxProfitII(t));
    }

    public int maxProfitII(int[] prices) {
//        int valley = prices[0];
//        int peak = prices[0];
//        int maxprofit = 0;
//        int i = 0;
//        while (i < prices.length - 1) {
//            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
//                i++;
//            valley = prices[i];
//            System.out.println("valley"+valley);
//            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
//                i++;
//            peak = prices[i];
//            System.out.println("peak"+peak);
//            maxprofit += peak - valley;
//        }
//        return maxprofit;
//    }
        int ans = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                ans += prices[i + 1] - prices[i];
            }
        }
        return ans;
    }
}
