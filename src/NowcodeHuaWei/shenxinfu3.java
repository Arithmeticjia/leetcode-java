package NowcodeHuaWei;

import java.util.Arrays;

/**
 * 最大硬币数
 */
public class shenxinfu3 {

    public int maxCoins (int[] piles) {
        // write code here
        Arrays.sort(piles);
        int length = piles.length;
        int rounds = length / 3;
        int coins = 0;
        int index = length - 2;
        for(int i = 0;i < rounds;i++){
            coins += piles[index];
            index -= 2;
        }

        return coins;
    }
}
