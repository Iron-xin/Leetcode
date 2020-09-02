package 剑指offer._54二叉搜索树的第K大节点;
//由于是第K大，而不是第k小，所以递归要从最右边的子树开始
//注意一定要
public class Solution2 {
    int res =0;
    int index =0;
    public int kthLargest(TreeNode root, int k) {
        if(root == null)
            return 0;
        dfs(root,k);
        return res;
    }

    public void dfs(TreeNode root,int k){
        if(root == null)
            return ;
        if(root.right != null){
            dfs(root.right,k);
        }
        index++;//相当于弹出节点时，才++表示遍历了某个节点
        if(index == k)
            res = root.val;
        if(root.left != null)
            dfs(root.left,k);
        return ;
    }
}
