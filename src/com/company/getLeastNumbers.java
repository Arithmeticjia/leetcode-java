package com.company;

import java.util.Arrays;

public class getLeastNumbers {

    public int[] getLeastNumbers(int[] arr,int k){
        // 排序
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr,0,k);
    }
}
