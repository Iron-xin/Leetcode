package 剑指offer._54二叉搜索树的第K大节点;

import java.util.Stack;
//别想太多，也就正常压入和弹出，只是弹出的时候计数而已
//而本题需要掌握非递归的中序遍历写法
public class Solution3 {
    public int kthLargest(TreeNode root, int k) {
        if(root == null)
            return 0;
        int res=0;
        int count=0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(!stack.isEmpty() ||node !=null){
            if(node != null){
                stack.push(node);
                node = node.right;
            }else{
                node = stack.pop();//当前节点null则弹出栈内元素，相当于按顺序输出最小值。
                count++;//弹出时，才应该计数
                if(count == k){ //相等时就返回
                    return node.val;
                }
                node = node.left;//右边遍历完，还没到K，就得找右子节点
            }
        }
        return res;
    }
}
