package offer;

/**
 * 剑指 Offer 33. 二叉搜索树的后序遍历序列
 * 递归分治
 * 1、划分左右子树，寻找 第一个大于根节点 的节点，索引记为 m
 * 2、判断是否为二叉搜索树
 */
public class verifyPostorder {

    public static void main(String[] args) {
        int[] test =  {1,6,2,3,5};
        verifyPostorder verifyPostorder = new verifyPostorder();
        System.out.println(verifyPostorder.verifyPostorder(test));
    }

    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    boolean recur(int[] postorder, int i, int j) {
        if(i >= j) {
            return true;
        }
        int p = i;
        while(postorder[p] < postorder[j]) {
            p++;
        }
        int m = p;
        while(postorder[p] > postorder[j]) {
            p++;
        }
        // 如果不是二叉搜索树的顺序，p和j是不相等的！！！
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }
}
