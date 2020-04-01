package com.company;

import java.util.Arrays;

public class constructArr {

    public static void main(String[] args){
        constructArr test = new constructArr();
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(test.constructArr(a)));
    }

    public int[] constructArr(int[] a){
        int[] res = new int[a.length];
//        这样也可以
//        res[0] = 1;
//        for(int i = 1;i < a.length;i++){
//            res[i] = res[i-1] * a[i-1];
//        }
        int left = 1;
        // res是一个数组，res[i]表示a[0]-a[i-1]的乘积
        for (int i = 0; i < res.length; i++) {
            res[i] = left;
            left *= a[i];
        }
        System.out.println(Arrays.toString(res));
        int right = 1;
        for(int i = a.length-1;i >= 0;i--){
            res[i] *= right;
            right *= a[i];
        }

        return res;
    }
}
