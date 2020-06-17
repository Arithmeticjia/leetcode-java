package sort.method;

import java.util.Arrays;


/**
 *  分治法
 *  首先设定一个分界值，通过该分界值把数组分为左右两个部分；
 *  将大于等于分界值的元素放到分界值的右边，将小于分界值的元素放到分界值的左边；
 *  然后对左右两边的数据进行独立的排序，在左边数据中取一个分界值，把小于分界值的元素放到分界值的左边，大于等于分界值的元素，放到数组的右边；右边的数据也执行同样的操作；
 *  重复上述操作，当左右各数据排序完成后，整个数组也就完成了排序。
 */
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
            // 找到low比基准大，high比基准小，进行交换
            if (low < high) {
                swap(arr, low, high);
            }
        }
        // 此时low和high相等
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
