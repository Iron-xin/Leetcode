package 剑指offer._68_1二叉搜索树的最近公共祖先;

public class Solution1 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //这里也可以先判断p q的大小，其实就是比最小的小时，找右边，比最大的大时，找左边，而第一个不符合上面两个条件的就是答案
        if(root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        if(root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        return root;

    }

}
