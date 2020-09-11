package NowcodeHuaWei;

import java.util.Arrays;

/**
 * leetcode 462
 * https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements-ii/solution/zui-shao-yi-dong-ci-shu-shi-shu-zu-yuan-su-xiang-2/
 * 有一个数组，每次将其一个值加一或者减一，使得每个值相等，求至少操作几次
 * 使用排序寻找中位数
 * 假设最终数组 a 中的每个数均为 x，那么需要移动的次数即为 |a[0] - x| + |a[1] - x| + ... + |a[n-1] - x|。
 * 如果我们把数组 a 中的每个数看成水平轴上的一个点，那么根据上面的移动次数公式，我们需要找到在水平轴上找到一个点 x，使得这 N 个点到 x 的距离之和最小。
 *
 */
public class youzan2 {

    public int minMoves (int[] nums) {
        // write code here
        int count = 0;
        if(nums.length == 1){
            return count;
        }

        Arrays.sort(nums);
        //找到中位数
        for(int i:nums){
            count += Math.abs(nums[nums.length/2]-i);
        }

        return count;
    }
}
