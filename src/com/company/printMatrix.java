package com.company;

import java.util.ArrayList;
public class printMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int x=0,y=0;
        int col = matrix[0].length;
        int row = matrix.length;
        for(int i=0;i < (col + 1) / 2; i++){
            for (int i1 = y; i1 < col - i -1; i1++) {
                res.add(matrix[x][++y]);
            }
            //从上到下遍历
            for (int i1 = x; i1 < row - i -1; i1++) {
                res.add(matrix[++x][y]);
            }
            //从右到左遍历
            for (int i1 = y; i1 > i ; i1--) {

                res.add(matrix[x][--y]);
            }
            //从下向上
            for (int i1 = x; i1 > i+1; i1--) {
                res.add(matrix[--x][y]);
            }
        }
        return res;
    }
}