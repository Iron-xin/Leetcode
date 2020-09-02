package _572另一个树的子树;

public class Solution1 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null)
            return false;
        return isSameTree(s,t)||isSubtree(s.left,t) ||isSubtree(s.right,t);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null &&q ==null)
            return true;
        if(p==null)
            return false;
        if(q==null)
            return false;
        return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}