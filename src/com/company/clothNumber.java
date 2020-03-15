package com.company;


import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;


public class clothNumber {

    public static void main(String[] args){
        clothNumber test = new clothNumber();
        int[][] t = {{1,1}};
        System.out.println(test.clothNumber(1,1,t));
    }

    public int clothNumber (int L, int W, int[][] clothSize) {
        // write code here
        int count = 0;
        for(int i=0;i<clothSize.length;i++){
            if(clothSize[i][0] <= L && clothSize[i][1] <= W){
                count++;
            }
        }
        return count;
    }
}
