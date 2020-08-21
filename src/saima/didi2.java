package saima;

import java.util.*;

public class didi2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n*n];
        HashMap<Integer,Integer> map =  new HashMap<>();

        n = n*n;

        for(int i=0;i < n;i++){
            a[i] = fib(i+1);
        }

        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                //返回值>0交换
                return b-a;
            }
        });

        n = (int)Math.sqrt(n);

        int[][] result = new int[n][n];
        int r ,l;//数组坐标
        int currentValue = 1;//当前加的值
        int count = n % 2 == 0 ? n / 2 : (n - 1) / 2 + 1;//上下左右各加一次为1圈操作，需要多少次的圈操作
        int m = n - 1;//下标从0开始，这里减一
        for (int j = 0; j < count; j++) {
            r = l = j;
            if (j == count - 1) {
                if (n % 2 != 0) {//这里就是判断如果是奇数的话就直接把最后一个值存入result中然//后退出。
                    result[r][l] = currentValue++;
                    break;
                }
            }
            for (int i = -1; i < m - 2 * j; i++) {//从-1开始，因为从左到右的加操作比下面的操作多一次
                result[r][l++] = currentValue++;
            }
            l--;
            r++;
            for (int i = 0; i < m - 2 * j; i++) {
                result[r++][l] = currentValue++;
            }
            r--;
            l--;
            for (int i = 0; i < m - 2 * j; i++) {
                result[r][l--] = currentValue++;
            }
            l++;
            r--;
            for (int i = 1; i < m - 2 * j; i++) {//一圈最后的操作比上面的少一次，所以i从1开始
                result[r--][l] = currentValue++;
            }
        }

//打印结果
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (result[i][j] < 10) {
                    System.out.print(a[result[i][j]-1] + " ");
                } else {
                    System.out.print(a[result[i][j]-1] + " ");
                }
            }
            System.out.println();
        }

    }

    public static int fib(int N){
        if(N <= 1){
            return N;
        }
        return fib(N-1)+fib(N-2);
    }








}

