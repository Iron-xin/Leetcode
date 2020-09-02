package _617合并二叉树;

import java.util.Stack;

public class Solution2 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null) return t2;
        if(t2 == null) return t1;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(t1);
        s2.push(t2);
        while(!s1.empty()){ // s1 s2出入栈是同步的 所以条件写一个就行
            TreeNode cur1 = s1.pop(); // 栈顶元素即为当前要合并的
            TreeNode cur2 = s2.pop();
            if(cur1.left != null && cur2.left != null){ // 当前节点的左子结点 有四种情况，但是均为null的不用处理。
                s1.push(cur1.left);
                s2.push(cur2.left);
            } else if(cur1.left == null) { // cur1.left == null 的两种情况处理方式使用这行代码均正确。
                cur1.left = cur2.left;
            }
            if(cur1.right != null && cur2.right != null){
                s1.push(cur1.right);
                s2.push(cur2.right);
            } else if(cur1.right == null){
                cur1.right = cur2.right;
            }
            cur1.val = cur1.val + cur2.val;
        }
        return t1;
    }
}
