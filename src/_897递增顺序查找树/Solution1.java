package _897递增顺序查找树;

public class Solution1 {
    TreeNode head = new TreeNode(-1) ;//虚拟头结点
    public TreeNode increasingBST(TreeNode root) {
        TreeNode res = head;//记录虚拟头结点，因为后续头结点作为指针会移动。
        if(root == null)
            return root;
        inorder(root);
        return res.right;
    }
    public TreeNode inorder(TreeNode node){
        if(node==null)
            return null;
        if(node.left!=null)
            inorder(node.left);
        TreeNode n = new TreeNode(node.val);
        head.right = n;
        head = head.right;
        if(node.right != null)
            inorder(node.right);
        return node;
    }
}
