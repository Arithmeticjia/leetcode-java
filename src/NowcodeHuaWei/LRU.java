package NowcodeHuaWei;

import java.util.LinkedHashMap;

import java.util.*;


public class LRU {
    /**
     * lru design
     * @param operators int整型二维数组 the ops
     * @param k int整型 the k
     * @return int整型一维数组
     */
    public int[] LRU (int[][] operators, int k) {
        // write code here
        //有序的hashmap
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        //若opt=1，接下来两个整数x, y，表示set(x, y)
        //若opt=2，接下来一个整数x，表示get(x)，若x未出现过或已被移除，则返回-1
        for (int[] operator : operators) {
            int opt = operator[0], key = operator[1];
            //set
            if (opt == 1) {
                if (map.containsKey(key)) {
                    map.remove(key);
                } else {
                    if (map.size() == k) {
                        map.remove(map.keySet().toArray()[0]);
                    }
                }
                map.put(key, operator[2]);
            //get
            } else if (opt == 2) {
                if (map.containsKey(key)) {
                    int val = map.remove(key);
                    map.put(key, val);
                    list.add(map.get(key));
                } else {
                    list.add(-1);
                }
            }
        }
        int[] arr=new int[list.size()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
