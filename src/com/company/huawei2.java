package com.company;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;
import java.util.Scanner;

public class huawei2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String target = in.next();
        String match = in.next();
        String[] ss = match.split("],");
        for(int i = 0; i < ss.length;i++){
            int l = 0;
            for(int j = 0;j < ss[i].length()-1;j++){
                if(ss[i].charAt(j+1) == '[' ){
                    l = j;
                    break;
                }
            }
            if(target.equals(ss[i].substring(0,l+1))){
                String[] k = ss[i].split("=");
                k[k.length-1] = k[k.length-1].substring(0,k[k.length-1].length()-1);
                for(int f = 0;f < 3;f++){
                    System.out.print(k[f+1].split(",")[0]);
                }

            }
        }
//      read[yy=ggg,ttt=uuu,yy=1555] System.out.print(t);
    }
}
