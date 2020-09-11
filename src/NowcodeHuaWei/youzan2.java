package NowcodeHuaWei;

import java.util.Arrays;

/**
 * 有一个数组，每次将其一个值加一或者减一，使得每个值相等，求至少操作几次
 */
public class youzan2 {

    public int minMoves (int[] nums) {
        // write code here
        int count = 0;
        if(nums.length == 1){
            return count;
        }

        Arrays.sort(nums);

        for(int i:nums){
            count += Math.abs(nums[nums.length/2]-i);
        }

        return count;
    }
}
