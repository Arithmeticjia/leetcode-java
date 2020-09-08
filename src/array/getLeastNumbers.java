package array;

import java.util.Arrays;

public class getLeastNumbers {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        int k = 2;
        System.out.print(Arrays.toString(new getLeastNumbers().getLeastNumbers(arr, k)));
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        // 最后一个参数表示我们要找的是下标为k-1的数
        return quickSearch(arr, 0, arr.length - 1, k - 1);
    }

    private int[] quickSearch(int[] nums, int lo, int hi, int k) {
        // 每快排切分1次，找到排序后下标为j的元素，如果j恰好等于k就返回j以及j左边所有的数；
        int j = partition(nums, lo, hi);
        if (j == k) {
            return Arrays.copyOf(nums, j + 1);
        }
        // 否则根据下标j与k的大小关系来决定继续切分左段还是右段。
        return j > k? quickSearch(nums, lo, j - 1, k): quickSearch(nums, j + 1, hi, k);
    }

    public void quickSort(int[] arr, int startIndex, int endIndex){
        if(startIndex < endIndex){
            int partition = partition(arr, startIndex, endIndex);
            quickSort(arr, startIndex, partition-1);
            quickSort(arr, partition,endIndex);
        }
    }

    public int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];
        int left = startIndex;
        int right = endIndex;
        while (left != right){
            while (left < right && arr[right] > pivot){
                right--;
            }
            while (left < right && arr[left] <= pivot){
                left++;
            }
            if(left < right){
                swap(arr, left, right);
            }
        }

        swap(arr, startIndex, left);
        return left;
    }

    private static void swap(int[] arr, int left, int right) {

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

    }
}

