package sort.method;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args){
        int[] t = {3,4,1,2};
        bubbleSort(t);
        System.out.print(Arrays.toString(t));
    }

    public static void bubbleSort(int[] nums){

        int temp;
        for(int i = 0;i < nums.length;i++){
            // 设置标记位，如果没发生交换，可以直接退出程序
            boolean flag = false;
            for(int j = 0;j < nums.length-i-1;j++){
                if(nums[j] > nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    flag = true;
                }
            }
            // 此时如果没有交换，那么flag==false，取反就是true
            if(!flag){
                break;
            }
        }
    }
}
