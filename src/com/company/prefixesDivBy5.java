package com.company;

import java.util.ArrayList;
import java.util.List;

public class prefixesDivBy5 {

    public List<Boolean> prefixesDivBy5(int[] A){
        List<Boolean> list =  new ArrayList<>();
        int sum = 0;
        for(int i = 0;i < A.length;i++){
            sum += A[i];
            sum = sum > 9 ? sum - 10: sum;
            if(sum == 0 || sum == 5){
                list.add(true);
            }else {
                list.add(false);
            }
            // 算出当前的二进制对应的十进制
            sum = sum * 2;
        }

        return list;
    }
}
