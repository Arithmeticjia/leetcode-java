package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class wangyi1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            long[] array = new long[n];
            for(int i = 0; i < n; i++){
                array[i] = in.nextInt();
            }
            long[] cha = new long[n-1];
            for(int i = 0;i < n-1;i++){
                cha[i] =array[i+1] - array[i];
            }
            long j = cha[0];
            boolean is = true;
            for(int i = 1;i < n-1;i++){
                j = gcd(j,cha[i]);
                if(j == 1){
                    is = false;
                    break;
                }
            }
            if(is){
                System.out.println(j);
            }else{
                System.out.println(-1);
            }
        }
    }

    public static long gcd(long a,long b){
        long t;
        if(a < b){
            t = a;
            a = b;
            b = t;
        }
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}