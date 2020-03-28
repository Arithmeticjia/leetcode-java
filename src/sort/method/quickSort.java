package sort.method;

import java.util.Arrays;

public class quickSort {

    public static void quickSort(int[] data, int left, int right){
        if(left < right){
            int i = left, j = right, tmp = data[left];
            while (i < j){
                //从右往左找不大于tmp的数据
                while(i < j && data[j] > tmp)
                {
                    j--;
                }
                //将不大于tmp的数据填入到左边的坑内
                if(i < j) {
                    data[i++] = data[j];
                }
                //从左往右找不小于tmp的数据
                while(i < j && data[i] < tmp)
                {
                    i++;
                }
                //将不小于tmp的数据填入到右边的坑内
                if(i < j) {
                    data[j--] = data[i];
                }
            }
            //将基准数据放入到剩余的坑内
            data[i] = tmp;
            System.out.print(Arrays.toString(data));
            //采用分治法的思想先左边再右边
            quickSort(data, left,i-1);
            quickSort(data, i+1, right);
        }
    }

    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 50};
        quickSort(a,0, a.length -1);
        for(int b : a) {
            System.out.print(b + " ");
        }
    }
}

