package bishi2020;

import java.util.Arrays;

public class Holy {

    public int Holy (int n, int m, int[] x) {
        // write code here
        int magic = 0;
        while(total(x) < n){
            Arrays.sort(x);
            int i = maxIndex(x);
            if(x[i] > n){
                return 0;
            }
            x[i] *= 2;
            magic += 1;
        }

        return magic;
    }
    public static int maxIndex(int[] x){
        int max=x[0],min=x[0];
        int maxId = 0;
        for(int i=1;i<x.length;i++){
            if(max<x[i]){
                max=x[i];
                maxId=i;
            }
        }
        return maxId;
    }

    public static int total(int[] x){
        int sum = 0;
        for(int  i = 0;i < x.length;i++){
            sum += x[i];
        }

        return sum;
    }
}
