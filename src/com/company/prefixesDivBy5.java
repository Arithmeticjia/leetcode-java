package com.company;

import java.util.ArrayList;
import java.util.List;

public class prefixesDivBy5 {

    public List<Boolean> prefixesDivBy5(int[] A){
        List<Boolean> list =  new ArrayList<>();
        int tail = 0;
        for(int i = 0;i < A.length;i++){
            // 算出最后一位即可
            tail = tail * 2 + A[i];
            tail = tail > 9 ? tail - 10: tail;
            if(tail == 0 || tail == 5){
                list.add(true);
            }else {
                list.add(false);
            }
        }

        return list;
    }
}
