package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class findMinArrowShots {

    public static void main(String[] args){
        int[][] p = {{10,16}, {2,8}, {1,6}, {7,12}};
        System.out.println(findMinArrowShots.findMinArrowShots(p));
    }

    public static int findMinArrowShots(int[][] points){
        if (points.length == 0) {
            return 0;
        }
        // 按坐标尾排序
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 当返回值大于0交换
                return o1[1] - o2[1];
            }
        });

        // 箭
        int arrows = 1;

        int xStart,xEnd;
        // 第一个气球尾
        int firstEnd = points[0][1];
        for (int[] p : points) {
            xStart = p[0];
            xEnd = p[1];
            // if the current balloon starts after the end of another one,
            // one needs one more arrow
            if (firstEnd < xStart) {
                arrows++;
                firstEnd = xEnd;
            }
        }
        return arrows;
    }

}
