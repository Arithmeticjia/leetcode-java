package com.company;

public class getSum {
    public int getSum(int a, int b){
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        int lower = 0;
        int carrier = 0;
        while(true){
            lower = a^b;
            carrier = a&b;
            if(carrier == 0){
                break;
            }
            a = lower;
            b = carrier>>1;
        }
        return lower;
    }
}
