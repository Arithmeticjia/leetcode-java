package com.company;

import java.math.BigInteger;
import java.util.*;


public class alibaba1{
    static long mod = 1000000007;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long ans = n * plan(2,n-1);
        System.out.print(ans%mod);

    }
    public static long plan(long m,long n){
        long res = 1;
        while(n!=0){
            if((n&1)==1){
                res = (res*m)%mod;
            }
            m = (m * m)%mod;
            double x = Math.pow(m,2);
            m = new Double(x).longValue();
            n>>=1;
        }
        return res;
    }
}