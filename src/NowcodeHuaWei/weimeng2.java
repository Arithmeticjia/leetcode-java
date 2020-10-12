package NowcodeHuaWei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class weimeng2 {

    HashMap<Long, Integer> dic = new HashMap<>();
    long[] po;
    public TreeNode2 buildTree(long[] preorder, long[] inorder) {
        po = preorder;
        for(int i = 0; i < inorder.length; i++) {
            dic.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
    }
    TreeNode2 recur(int pre_root, int in_left, int in_right) {
        if(in_left > in_right) {
            return null;
        }
        TreeNode2 root = new TreeNode2(po[(int) pre_root]);
        int i = dic.get(po[pre_root]);
        root.left = recur(pre_root + 1, in_left, i - 1);
        root.right = recur(pre_root + i - in_left + 1, i + 1, in_right);
        return root;
    }

    public long[] buildPostOrder (long[] preorderData, long[] inorderData) {
        // write code here
        TreeNode2 res = buildTree(preorderData, inorderData);
        ArrayList<Long> ans = postorderTraversal(res);
        long[] arr = new long[ans.size()];
        for(int i = 0; i < ans.size();i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }

    public ArrayList<Long> postorderTraversal(TreeNode2 root) {
        ArrayList<Long> res = new ArrayList<Long>();
        postorder(root, res);
        return res;
    }

    public void postorder(TreeNode2 root, List<Long> res) {
        if (root == null) {
            return;
        }
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new weimeng2().buildPostOrder(new long[]{1, 2, 3}, new long[]{2, 1, 3})));
    }


}

class TreeNode2 {
    long val = 0;
    TreeNode2 left = null;
    TreeNode2 right = null;

    public TreeNode2(long i) {
        this.val = i;
    }
}
