package _1379找出克隆二叉树中的相同节点;

public class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return checkTarget(original,cloned,target);
    }

    public TreeNode checkTarget(TreeNode oNode,TreeNode cNode,TreeNode target){
        if (oNode==null)return null;//原来的是空，那必然空
        if (oNode==target)return cNode;//在原来的找到了，那副本对应位置的也直接返回了

        TreeNode left = checkTarget(oNode.left,cNode.left,target);
        if (left!=null)return left;//如果左边找到了就直接返回啊 不为空就说明找到了

        TreeNode right =checkTarget(oNode.right,cNode.right,target);
        if (right!=null)return right;
        //左边和右边都没找到，自然是返回空
        return null;
    }
}
