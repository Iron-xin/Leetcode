package _100相同的树;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null &&q ==null)
            return true;
        if(p==null)
            return false;
        if(q==null)
            return false;

//        isSameTree(p.left,q.left);
//        isSameTree(p.right,q.right);

        return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
