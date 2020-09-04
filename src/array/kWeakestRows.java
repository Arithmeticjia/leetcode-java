package array;

import java.util.Arrays;

/**
 * 1337. 方阵中战斗力最弱的 K 行
 * 每一行相加*100+索引
 * 然后排序
 * 最后对100取余就是索引自己
 */
public class kWeakestRows {

    public int[] kWeakestRows(int[][] mat, int k){
        int[] list = new int[mat.length];
        int[] res = new int[k];
        for(int i = 0; i < mat.length;i++){
            list[i] = count(mat[i])*100 + i;
        }
        Arrays.sort(list);
        for(int i = 0; i < k;i++){
            res[i] = list[i] % 100;
        }

        return res;
    }

    public static int count(int[] arr){
        int sum = 0;
        for(int n:arr){
            if(n != 1){
                break;
            }
            sum += n;
        }

        return sum;
    }
}
