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
        int min = nums[length-1];
        for(int i = 0; i < length;i++){
            if (nums[i] < max) {
                left = i;
            }else {
                max = nums[i];
            }
            if(nums[length - i - 1] > min){
                right = length -i - 1;
            }else {
                min = nums[length - i - 1];
            }
        }
        //left移到了所选子数组的最后一个元素，right移到了子数组第一个元素
        return left - right + 1;
    }
}
