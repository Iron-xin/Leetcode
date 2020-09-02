package _437路径之和III;

public class Solution {
    private int count = 0;
    //函数：对原树的每一个节点都调用pathSum函数（也就是每个节点都当做根节点算一算）
    public int pathSum(TreeNode root,int sum){
        if(root == null){
            return 0;//终止本轮递归
        }
        recurallnode(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return count;
    }
    //对一个结点进行路径的判断
    public int recurallnode(TreeNode root, int sum) {
        if(root == null){
            return 0;
        }
        if(sum == root.val){
            count++;//不应终止本轮递归 因为可能某条路径的子路径符合要求
        }
        recurallnode(root.left,sum-root.val);
        recurallnode(root.right,sum-root.val);
        return 0;
    }
}
