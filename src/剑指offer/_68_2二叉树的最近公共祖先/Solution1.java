package 剑指offer._68_2二叉树的最近公共祖先;

//        如果p和q分别是root的左右节点，那么root就是我们要找的最近公共祖先
//        如果p和q都是root的左节点，那么返回lowestCommonAncestor(root.left,p,q)，也就是向左找
//        如果p和q都是root的右节点，那么返回lowestCommonAncestor(root.right,p,q)。也就是向右找
//

public class Solution1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q)//如果为空返回空，如果等于p或q，说明p和q是根节点，另一个节点在子树中
            return root;
        //到这里，说明根节点不是空，且和pq都不相等，(下面两行是分别假设在左边和右边有祖先)
        TreeNode leftNode=lowestCommonAncestor(root.left,p,q);//都是左边，leftnode就是左边的求出祖先
        TreeNode rightNode=lowestCommonAncestor(root.right,p,q);//都是右边，rightnode就是右边求出的祖先

        if(leftNode==null)//左树没找到P和q，说明祖先在当前根节点的某个右子树上，返回求出的右边的祖先
            return rightNode;
        if(rightNode==null)//右树没找到，说明在左半边，返回左边求出的祖先
            return leftNode;
        //都没找到，说明一个在左，一个在右，根节点就是祖先节点
        return root;
    }

}