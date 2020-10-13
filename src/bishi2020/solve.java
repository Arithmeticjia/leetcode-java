package bishi2020;

import java.util.*;


public class solve {
    /**
     * 扩散
     */

    public static void main(String[] args) {
        int n = 4, m = 2;
        int[] u = {1,2,2};
        int[] v = {2,3,4};
        int[] q = {2,1};

        System.out.print(Arrays.toString(new solve().solve(n, m, u, v, q)));
    }

    public int[] solve(int n, int m, int[] u, int[] v, int[] q) {
        // write code here
        //record 记录<工厂，生产力>
        HashMap<Integer,Integer> record = new HashMap<>();
        HashMap<Integer,Integer> res = new HashMap<>();
        //遍历m次生产力提升
        //每次生成力提升都发生在一个工厂
        for (int i = 0; i < m; i++) {
            if (record.containsKey(q[i] - 1)) {
                int tempNum = record.get(q[i] - 1);
                //相近的生产力+1
                record.put(q[i] - 1, tempNum + 1);
                //生产力+1
                res.put(q[i] - 1, tempNum + 1);
            } else {
                record.put(q[i] - 1, 1);
                res.put(q[i] - 1, 1);
            }
        }
        //表示0,1位置的工厂生产力都提升了1，对应工厂1，2
        System.out.print(record);
        System.out.print(res);
        //遍历工厂数-1
        for (int i = 0; i < n - 1; i++) {
            //判断记录里有哪些工厂
            //此时1-1已经有记录了
            if (record.containsKey(v[i] - 1)) {
                int tempNum = 0;
                //如果返回结果里面也有对应的记录
                if (res.containsKey(u[i] - 1)) {
                    tempNum = res.get(u[i] - 1);
                }
                //没有记录
                res.put(u[i] - 1, tempNum + record.get(v[i] - 1));
            }
            if (record.containsKey(u[i] - 1)) {
                int tempNum = 0;
                if (res.containsKey(v[i] - 1)) {
                    tempNum = res.get(v[i] - 1);
                }
                res.put(v[i] - 1, tempNum + record.get(u[i] - 1));
            }
        }
        int[] productivity = new int[n];
        for (int i = 0; i < n; i++) {
            if (res.containsKey(i)) {
                productivity[i] = res.get(i);
            }
        }
        return productivity;
    }
}
