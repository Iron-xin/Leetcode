package _938二叉树的范围和;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null){
            return 0;
        }
        int result = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode temp = null;
        while(!queue.isEmpty()){
            temp = queue.poll();
            if(temp.val >= L && temp.val <= R){
                result += temp.val;
            }
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        return result;
    }
}
