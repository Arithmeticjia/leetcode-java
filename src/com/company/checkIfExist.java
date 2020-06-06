package com.company;

import java.util.HashMap;

public class checkIfExist {

    public static void main(String[] args) {
        int[] arr = {-20,8,-6,-14,0,-19,14,4};
        System.out.println(checkIfExist.checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a: arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        System.out.println(map);

        for(int n: arr){
            int m = 2 * n;
            if(n != 0 && map.containsKey(m)){
                return true;
            }
            if(n == 0 && map.containsKey(0)){
                if(map.get(0) >= 2){
                    return true;
                }
            }
        }
        return false;
    }
}
