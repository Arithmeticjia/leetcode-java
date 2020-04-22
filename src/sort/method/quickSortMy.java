package sort.method;

import java.util.Arrays;

public class quickSortMy {

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            //找出基准本来的位置
            int partition = partition(arr, left, right);
            //分成两边递归进行
            quickSort(arr, 0, partition - 1);
            quickSort(arr, partition + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        // 基准取左边第一个
        int pivot = arr[left];
        // 左指针
        int low = left;
        // 右指针
        int high = right;
        while(low != high){

            while (low < high && arr[high] > pivot) {
                high--;
            }
            while (low < high && arr[low] <= pivot) {
                low++;
            }
            //找到low比基准大，high比基准小，进行交换
            if (low < high) {
                swap(arr, low, high);
            }
        }
        // 交换基准和low
        swap(arr,left,low);
        return low;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 1, 3, 7, 9, 8, 5};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
