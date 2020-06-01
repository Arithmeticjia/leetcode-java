package treenode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * 二叉树的所有路径
 * 递归
 * DFS
 */
public class binaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root){

//        LinkedList<String> paths = new LinkedList();
        ArrayList<String> paths = new ArrayList<>();
        construct_paths(root, "", paths);
        return paths;
    }

    private void construct_paths(TreeNode root, String path, ArrayList<String> paths) {

        if(root != null){
            path += Integer.toString(root.val);
            // 叶子节点
            if ((root.left == null) && (root.right == null)){
                paths.add(path);
            }else {
                path += "->";
                construct_paths(root.left,path,paths);
                construct_paths(root.right, path, paths);
            }
        }
    }

}
