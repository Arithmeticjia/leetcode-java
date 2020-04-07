package com.company;

import java.util.HashMap;

public class waysToStep {
    final static int mod = 1000000007;
    public static int waysToStep(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        if(n == 3){
            return 4;
        }
        long[] result = new long[n];
        result[0] = 1;result[1] = 2;result[2] = 4;
        for(int i = 3;i < n;i++){
            result[i] = (result[i-3] % mod + result[i-2] % mod + result[i-1] % mod) % mod;
        }
        return (int)result[n-1];
    }
}
