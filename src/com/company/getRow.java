package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. 杨辉三角 II
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 3
 * 输出: [1,3,3,1]
 */
public class getRow {

    public static void main(String[] args) {
        int rowIndex = 3;
        System.out.println(getRow.getRow(rowIndex + 1));
    }

    public static List<Integer> getRow(int rowIndex){

        List<Integer> res = new ArrayList<>();

        if(rowIndex == 0){
            res.add(1);
            return res;
        }

        if(rowIndex == 1){
            res.add(1);
            res.add(1);
            return res;
        }

        List<Integer> preRes = getRow(rowIndex - 1);
        res.add(1);
        for(int i = 1;i < rowIndex;i++){
            res.add(preRes.get(i - 1) + preRes.get(i));
        }
        res.add(1);


        return res;
    }
}
