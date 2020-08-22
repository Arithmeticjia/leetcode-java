package saima;

import java.util.*;

public class meituan5 {
    public static int size;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] values = new int[size];
        int[] sequences = new int[size];
        for (int i = 0; i < size; i++) {
            values[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            sequences[i] = sc.nextInt() - 1;
        }
//        int size = 5;
//        int[] values = new int[]{1,2,3,4,5};
//        int[] sequences = new int[]{2,3,0,4,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put(i, values[i]);
        }
        for (int i = 0; i < size; i++) {
            int pos = sequences[i];
            map.put(pos, 0);
            int left = 0;
            if (pos == 0) left = 0;
            else {
                for (int index = 0; index < pos; index++) {
                    left += map.get(index);
                }
            }
            int right = 0;
            if (right == size - 1) right = 0;
            else {
                for (int index = pos + 1; index < size; index ++) {
                    right += map.get(index);
                }
            }
            System.out.println(Math.max(left, right));
        }
    }
}