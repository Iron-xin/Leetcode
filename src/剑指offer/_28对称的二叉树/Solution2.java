package 剑指offer._28对称的二叉树;

import java.util.Stack;

public class Solution2 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        return  isSameTree(root.left,root.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null) return false;
        if (q == null) return false;
        Stack<TreeNode> stackP = new Stack<>();
        stackP.add(p);
        Stack<TreeNode> stackQ = new Stack<>();
        stackQ.add(q);
        while (!stackP.isEmpty() || !stackQ.isEmpty()) {
            TreeNode pNode = stackP.pop();
            TreeNode qNode = stackQ.pop();
            if (pNode.val != qNode.val) {
                return false;
            } else {
                //都为空就不用管
                if(pNode.right==null && qNode.left !=null)
                    return false;
                if(pNode.right!=null && qNode.left ==null)
                    return false;
                if(pNode.left != null &&qNode.right ==null)
                    return false;
                if(pNode.left == null &&qNode.right !=null)
                    return false;
                if(pNode.left !=null &&qNode.right !=null)
                {
                    stackP.add(pNode.left);
                    stackQ.add(qNode.right);
                }
                if(pNode.right!=null &&qNode.left !=null){
                    stackP.add(pNode.right);
                    stackQ.add(qNode.left);
                }
            }
        }
        return true;
    }
    public boolean isSameTree2(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null) return false;
        if (q == null) return false;
        Stack<TreeNode> stackP = new Stack<>();
        stackP.add(p);
        Stack<TreeNode> stackQ = new Stack<>();
        stackQ.add(q);
        while (!stackP.isEmpty() || !stackQ.isEmpty()) {
            TreeNode pNode = stackP.pop();
            TreeNode qNode = stackQ.pop();
            if (pNode == null && qNode == null) continue;
            if (pNode == null) return false;
            if (qNode == null) return false;
            if (pNode.val != qNode.val) {
                return false;
            } else {
                stackP.add(pNode.right);
                stackQ.add(qNode.left);
                stackP.add(pNode.left);
                stackQ.add(qNode.right);
            }
        }
        return true;
    }
}
