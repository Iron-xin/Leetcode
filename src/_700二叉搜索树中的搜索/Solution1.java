package _700二叉搜索树中的搜索;

public class Solution1 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return null;
        if(root.val < val){
            return searchBST(root.right,val);
        }
        if(root.val > val){
            return searchBST(root.left,val);
        }
        //if(root.val == val)
        return root;

    }
}