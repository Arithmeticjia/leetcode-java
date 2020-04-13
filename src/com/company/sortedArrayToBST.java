package com.company;

public class sortedArrayToBST {

    public TreeNode helper(int[] nums,int left,int right){
        if(left > right){
            return null;
        }
        int mid = left + (right - left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums,left,mid-1);
        node.right = helper(nums,mid+1,right);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        return helper(nums,left,right);
    }
}
