package sort.method;

import java.util.Arrays;

/**
 * 最佳情况：T(n) = O(n)
 * 最差情况：T(n) = O(n2)
 * 平均情况：T(n) = O(n2)
 */

public class bubbleSort {

    public static void main(String[] args){
        int[] t = {3,4,1,2};
        bubbleSort(t);
        System.out.print(Arrays.toString(t));
    }

    public static void bubbleSort(int[] nums){

        int temp;
        //比较次数
        for(int i = 0;i < nums.length;i++){
            // 设置标记位，如果没发生交换，可以直接退出程序
            boolean flag = false;
            for(int j = 0;j < nums.length-i-1;j++){
                if(nums[j] > nums[j+1]){
                    // 前面一个大于后面一个
                    // 交换
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    // 表示交换过了
                    flag = true;
                }
            }
            // 此时如果没有交换，那么flag==false，取反就是true
            // 此时没有交换，表示已经有序
            // 直接退出循环
            if(!flag){
                break;
            }
        }
    }
}
