package com.company;

import java.util.HashSet;
import java.util.Set;

public class isContinuous {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        int maxn = -1, minn = 14;
        for(int a: numbers)
        {
            if(!set.add(a) && a!=0) {
                return false;
            }
            if(a!=0) {
                maxn = Math.max(maxn, a);
                minn = Math.min(minn, a);
            }
        }
        if(maxn - minn <=4) {
            return true;
        }
        return false;

    }
}