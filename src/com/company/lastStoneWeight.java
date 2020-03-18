package com.company;
import java.awt.*;
import java.util.Arrays;

public class lastStoneWeight {


    public static void main(String[] args){
        lastStoneWeight test = new lastStoneWeight();
        int[] t = {321,900,972,910,478,730,814,543,887,824,831};
        int[] h = {2,7,4,1,8,1};
        int[] k = {3,1,2,3};
        System.out.println(test.lastStoneWeight(k));
    }


    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        // 从最后一个石头开始
        for (int i = stones.length - 1; i > 0; --i) {
            // 排序0到最后一个石头
            Arrays.sort(stones, 0, i + 1);
            for(int j = 0;j < stones.length;j++){
                System.out.print(stones[j]);
            }
            System.out.print("\n");
            // 将粉碎剩余放入靠前的石块
            stones[i - 1] = stones[i] - stones[i - 1];

        }
        return stones[0];
    }
}
