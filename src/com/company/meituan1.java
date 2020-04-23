package com.company;

import java.util.ArrayList;

public class meituan1 {

    public int lastRemaining(int n, int m, int[] nums) {
        boolean[] arr = new boolean[n];
        // 一开始所有都为true
        for(int i = 0;i < n;i++){
            arr[i] = true;
        }

        int personLength = n;
        int countNum = 0;
        int index = 0;
        while(personLength > 1){
            if(arr[index] == true){
                // 报数
//                countNum++;
                if(countNum == nums[countNum]){

                    System.out.println(countNum);
                    // 重新开始报数
                    countNum = 0;
                    // 退出
                    arr[index] = false;
                    // 总人数减一
                    personLength--;
                }
                countNum++;
            }
            // 已经退出的话直接再向前一个
            index++;
            // 到末尾重新开始
            if(index == n){
                index = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == true) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int n = 4;
        int[] nums = {1,2,1,2};
        int m = 3;
        System.out.println(new meituan1().lastRemaining(n,m,nums));
    }

}





