package _1022从根到叶的二进制数之和;

public class Solution1 {
    int res = 0;
    public int sumRootToLeaf(TreeNode root) {
        int sum=0;
        if(root == null)
            return 0;
        Tree(root,0);
        return res;
    }
    public int Tree(TreeNode root,int sum) {
        //这里巧妙的是。不是判断root是否为空，而是判断其子节点，不为空说明还能遍历。则把当前的root.val添加到字符串s中
        //也就是不用判断root == null
        if (root.right != null) {
            Tree(root.right, sum*2 + root.val);
        }
        if (root.left != null) {
            Tree(root.left, sum*2 + root.val);
        }
        //只有当root左右子树为空是，则求和
        if (root.left == null && root.right == null){ res = res + 2*sum+root.val;}
        return sum;
    }
}
//非常类似的写法，只是遍历到某个节点时，就添加，而上面的是准备遍历下一个时才添加，其实建议掌握下面这种
//下面这种进来一个节点就直接加的，更加直观
class Solution {
    int sum=0;
    public int sumRootToLeaf(TreeNode root) {
        if(root==null) return -1;
        helper(root,0);
        return sum;
    }
    public void helper(TreeNode root,int num){
        if(root==null) return;
        num+=root.val;
        if(root.left==null&&root.right==null){
            sum+=num;
        }
        helper(root.left,num*2);
        helper(root.right,num*2);
    }
}
