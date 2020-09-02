package _783二叉搜索树的最小距离;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    TreeNode pre = null;//记录前一个节点
    int res = Integer.MAX_VALUE;


    public int minDiffInBST(TreeNode root) {
        if (root == null) return 0;
        helper(root);
        return res;
    }

    private void helper(TreeNode root) {
        if (root == null) return;
        helper(root.left);
        if (pre != null) {
            //求相邻节点的差值
            res = Math.min(res, Math.abs(root.val - pre.val));
        }
        pre = root;//等于当前节点
        helper(root.right);
    }

}

//使用数组的
class Solution1{

    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        // 进行中序遍历
        inOrder(root, list);
        int minValue = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            minValue = Math.min(minValue, (list.get(i) - list.get(i - 1)));
        }
        return minValue;
    }
    public void inOrder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }
}
