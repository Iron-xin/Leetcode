package _669修剪二叉搜索树;

public class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }

        TreeNode left = trimBST(root.left, L, R);//left记录的是root左边的节点（变动或者不变动）
        TreeNode right = trimBST(root.right, L, R);//right记录的root右边的节点


        if (root.val < L) //比左边的还小，说明这个节点该删了，
            return root = right;//那么就应该更新为root右边的节点

        if (root.val > R) //比R还大，说明太大了，也得删
            return root = left;//那么更新root为左边的节点


        root.left = left;
        root.right = right;

        return root;
    }
    //两个写法都可以，用下面的这个来理解更好！！！！！
    public TreeNode trimBST1(TreeNode root, int L, int R) {
        if (root == null)
            return root;

        //下面两个if相当于删除不满足要求的节点
        if (root.val < L)
            //注意，给定根节点，那么你返回的默认也是根节点，所以下面可以写成return trimBST(root.right, L, R);
            return root = trimBST(root.right, L, R);//返回修剪过的右子树。
        if (root.val > R)
            return root =trimBST(root.left, L, R);//返回修剪过的左子树

        //处理正常的节点，根的左边等于修剪过后的坐边，根的右边等于修剪过后的右边
        //注意，特殊情况是更新root节点，而普通正常的情况，是更新左右子树的节点。
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}