package com.company;
import java.util.*;

public class duplicate {

    public boolean duplicate(int numbers[],int length,int [] duplication) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < length;i++){
            if(!map.containsKey(numbers[i])){
                map.put(numbers[i],1);
            }else{
                map.put(numbers[i],map.get(numbers[i])+1);
            }
        }
        for(int i = 0; i<length;i++){
            if(map.get(numbers[i])>=1){
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
}
