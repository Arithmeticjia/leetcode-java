package array;

/**
 * 581. 最短无序连续子数组
 */
public class findUnsortedSubarray {

    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        System.out.print(new findUnsortedSubarray().findUnsortedSubarray(nums));
    }

    public int findUnsortedSubarray(int[] nums) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        int max = nums[0];
        int min = nums[length - 1];
        for(int i = 0; i < length;i++){
            if (nums[i] < max) {
                left = i;
            }else {
                max = nums[i];
            }
        }
        //遍历完发现是递增数组，直接返回
        if(left == 0) {
            return 0;
        }
        for(int i = length -1; i >= 0;i--){
            if(nums[i] > min){
                right = i;
            }else {
                min = nums[i];
            }
        }
        //left移到了所选子数组的最后一个元素，right移到了子数组第一个元素
        return left - right + 1;
    }
}
