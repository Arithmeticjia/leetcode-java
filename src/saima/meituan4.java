package saima;

import java.util.Scanner;

public class meituan4 {

    public static int size;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();
        int[] values = new int[size];
        int[] sequences = new int[size];
        int[][] ans = new int[3][size];
        for(int i = 0; i< size;i++){
            values[i] = sc.nextInt();
        }
        for(int i = 0; i < size;i++){
            sequences[i] = sc.nextInt() - 1;

        }

        ans[0][0] = values[0];
        for(int i = 0; i < size;i++){
            ans[0][i] = ans[0][i-1] + values[i];
        }

        ans[1][size-1] = values[size-1];
        for(int i = size - 2;i >= 0;i--){
            ans[1][i] = ans[1][i+1] + values[i];
        }

        for(int i = 0; i < size;i++){
            int pos = sequences[i];
            ans[2][pos] = 1;
            int result = calMax(ans, pos);
            System.out.print(result);
        }

    }

    public static int calMax(int[][] res, int pos){
        int left = -1;
        int right = -1;
        if(pos > size - 1){
            right = 0;
        }else {
            for(int i = pos + 1;i <size;i++){
                if(res[2][i] == 0){
                    right = res[1][i];
                    break;
                }
            }
            right = right > 0?right:0;
        }

        if(pos == 0){
            left = 0;
        }else {
            for( int i = pos  -1; i >= 0;i--){
                if(res[2][i] == 0){
                    left = res[0][1];
                    break;
                }
            }
            left = left > 0? left:0;
        }

        return Math.max(left,right);
    }

}
