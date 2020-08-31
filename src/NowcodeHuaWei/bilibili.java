package NowcodeHuaWei;

import java.util.Arrays;

public class bilibili {

    public  long func(int[] nums){
        Arrays.sort(nums);
        long sum = 0;
        long max = 0;
        for(int j = 0; j <nums.length;j++){
            sum += nums[j];
            int index1 = j;
            int index2 = j;
            int index3 = j;
            for(int i = 0; i <= j; i++){
                while(index1 > 0&& nums[index1-1]>=nums[j]-nums[i]){
                    index1--;
                }
                while(index2 > 0&& nums[index2-1]>=nums[j]-nums[i]){
                    index2--;
                }
                while(index3 < nums.length && (long)nums[index3]<(long)nums[i]+nums[j]){
                    index1--;
                }
                long tmp1 = (i - index1)*((long)nums[j]-nums[i]) + (j-i)*(long)nums[i]+(nums.length-j)*(long)nums[j];
                long tmp2 = (index2 - i)*((long)nums[j]-nums[i]) + (j-index2)*(long)(nums[j]-nums[i])+(nums.length-j)*(long)nums[j];
                long tmp3 = (j-i)*(long)nums[i] + (index3-j)*(long)nums[j]+(nums.length-index3)*((long)(nums[i])+nums[j]);

                max = Math.max(max,tmp1);
                max = Math.max(max,tmp2);
                max = Math.max(max,tmp3);
            }
        }

        return sum - max;
    }

}
