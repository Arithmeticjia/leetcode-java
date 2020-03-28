package sort.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class mergeSort {

    public static void main(String[] args){
        mergeSort test = new mergeSort();
        int[] t = {6,2,3};
        test.mergeSort(t,0,2);
        for(int i:t){
            System.out.println(i);
        }
    }

    public void merge(int [] a,int left,int mid,int right){
        //辅助数组
        int [] tmp = new int[a.length];
        //p1、p2是检测指针，k是存放指针
        int p1 = left,p2 = mid + 1,k = left;

        while(p1 <= mid && p2 <= right){
            if(a[p1] <= a[p2]) {
                tmp[k++] = a[p1++];
            }else{
                tmp[k++] = a[p2++];
            }
        }

        while(p1 <= mid) {
            //如果第一个序列未检测完，直接将后面所有元素加到合并的序列中
            tmp[k++] = a[p1++];
        }
        while(p2 <= right) {
            //同上
            tmp[k++] = a[p2++];
        }

        //复制回原素组
        for (int i = left; i <=right; i++) {
            a[i]=tmp[i];
        }
    }

    public void mergeSort(int [] a,int start,int end){
        //当子序列中只有一个元素时结束递归
        if(start < end){
            //划分子序列
            int mid=(start+end)/2;
            //对左侧子序列进行递归排序
            mergeSort(a, start, mid);
            //对右侧子序列进行递归排序
            mergeSort(a, mid+1, end);
            //合并
            merge(a, start, mid, end);
        }
    }


}
