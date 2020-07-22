package offer;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 *
 * 循环二分： 设置 ii, jj 指针分别指向 numbers 数组左右两端，m = (i + j) // 2m=(i+j)//2 为每次二分的中点（ "//" 代表向下取整除法，因此恒有 i \leq m < ji≤m<j ），可分为以下三种情况：
 * 当 numbers[m] > numbers[j]时： mm 一定在 左排序数组 中，即旋转点 xx 一定在 [m + 1, j][m+1,j] 闭区间内，因此执行 i = m + 1i=m+1；
 * 当 numbers[m] < numbers[j] 时： mm 一定在 右排序数组 中，即旋转点 xx 一定在[i, m][i,m] 闭区间内，因此执行 j = mj=m；
 * 当 numbers[m] == numbers[j] 时： 无法判断 mm 在哪个排序数组中，即无法判断旋转点 xx 在 [i, m][i,m] 还是 [m + 1, j][m+1,j] 区间中。解决方案： 执行 j = j - 1j=j−1 缩小判断范围 （分析见以下内容） 。
 */
public class minArray {

    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while(low < high){
            int pivot = low + (high - low) / 2;
            if(numbers[pivot] < numbers[high]){
                high = pivot;
            }else if(numbers[pivot] > numbers[high]){
                low = pivot + 1;
            }else {
                high = high - 1;
            }
        }

        return numbers[low];
    }
}
