package sort.method;

import java.util.Arrays;

public class selectSort {


    public static void main(String[] args){
        int[] t = {3,4,1,2};
        System.out.print(Arrays.toString(selectSort(t)));
    }
    /**
     * 选择排序
     * @param array
     * @return
     * 最佳情况：T(n) = O(n2)
     * 最差情况：T(n) = O(n2)
     * 平均情况：T(n) = O(n2)
     */
    public static int[] selectSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                //找到最小的数
                if (array[j] < array[minIndex])
                {
                    //将最小数的索引保存
                    minIndex = j;
                }
            }
            // 交换从i往后的最小数和当前数
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
