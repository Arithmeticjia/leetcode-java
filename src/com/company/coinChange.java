package com.company;

public class coinChange {
    public int coinChange(int[] coins, int amount) {
        if (amount < 1) return 0;
        return coinChange(coins, amount, new int[amount]);
    }

    private int coinChange(int[] coins, int rem, int[] count){
        // 如果余额<0，此路不通
        if(rem < 0){
            return -1;
        }
        // 成功
        if(rem == 0){
            return 0;
        }
        //如果备忘录有值
        if(count[rem-1] != 0){
            return count[rem - 1];
        }
        int min = Integer.MAX_VALUE;
        for(int coin: coins){
            int res = coinChange(coins,rem - coin,count);
            if(res >= 0 && res < min){
                min = res + 1;
            }
        }
        count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[rem - 1];
    }
}
