package com.company;


import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 */
public class generate {

    public List<List<Integer>> generate(int numRows) {
        // 返回值
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        if (numRows == 0) {
            return triangle;
        }
        // 第一个永远是1
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int rowNum = 1;rowNum < numRows;rowNum++){
            // 杨辉三角的一行
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum-1);

            row.add(1);

            for(int j = 1; j < rowNum;j++){
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }

            row.add(1);

            triangle.add(row);

        }

        return triangle;

    }
}
