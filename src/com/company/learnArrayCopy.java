package com.company;

import java.util.Arrays;

public class learnArrayCopy {
    public static void main(String[] args){
        int[] a = {1,2,3};
        int[] b = new int[3];
        System.arraycopy(a,2,b,1,1);
        System.out.println(Arrays.toString(b));
    }
}
