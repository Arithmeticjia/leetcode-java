package com.company;

import java.util.ArrayList;
import java.util.List;

public class fromnpickk {

    public static void main(String[] args){
        fromnpickk test = new fromnpickk();
        System.out.print(test.fromnpickk(3,2));
    }

    public List<List<Integer>> fromnpickk(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();               // 临时变量，一个符合条件的解
        backtrack(n,k,1,result,list);                   // 回溯函数
        return result;
    }

    public void backtrack(int n,int k, int start, List<List<Integer>> result ,List<Integer> list){
        if (k < 0) return;
        else if (k == 0){
            result.add(new ArrayList<>(list));
        }else {
            for (int i = start;i <= n; i++){
                list.add(i);                            // 添加元素
                backtrack(n,k-1,i+1,result,list);
                list.remove(list.size()-1);       // 回退

            }
        }
    }
}
