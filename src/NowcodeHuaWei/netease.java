package NowcodeHuaWei;

import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] k = new int[m];
        for(int i = 0;i < m;i++){
            k[i] = sc.nextInt();
        }
        int[] res = searchRange(k,n);

//        for(int i = 0;i < res.length;i++){
//            System.out.print(res[i]);
//        }
        System.out.print(res[0]);
        System.out.print(" ");
        System.out.print(res[1]);
        //System.out.println(Arrays.toString(searchRange(k, n)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] targetRange = {-1, -1};

        // find the index of the leftmost appearance of `target`.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                targetRange[0] = i;
                break;
            }
        }

        // if the last loop did not find any index, then there is no valid range
        // and we return [-1, -1].
        if (targetRange[0] == -1) {
            return targetRange;
        }

        // find the index of the rightmost appearance of `target` (by reverse
        // iteration). it is guaranteed to appear.
        for (int j = nums.length-1; j >= 0; j--) {
            if (nums[j] == target) {
                targetRange[1] = j;
                break;
            }
        }

        return targetRange;
    }
}

