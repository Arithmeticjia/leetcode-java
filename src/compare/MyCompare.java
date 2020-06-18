package compare;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 对二维数组的某一维进行自定义排序
 */
public class MyCompare {

    public static void main(String[] args) {
        int[][] p = {{10,16}, {2,8}, {22,6}, {7,12}};

        Arrays.sort(p, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 返回值大于0交换
                return o1[0] - o2[0];
            }
        });

        System.out.println(Arrays.deepToString(p));
    }
}
