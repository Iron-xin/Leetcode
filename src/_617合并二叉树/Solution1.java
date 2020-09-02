package _617合并二叉树;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null) return t2;
        if(t2 == null) return t1;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(t1);
        queue.add(t2);
        TreeNode temp1 = null;
        TreeNode temp2 = null;
        while(!queue.isEmpty()){
            //要注意，只有两个都不为空，才需要入队，如果我们一t1为合并结果，t1节点为空时，直接让指向t2节点即可，不用入队
            //t1为空，t2不为空，为空都可以直接指。而t1不空，t2空，是不用处理的
            temp1 = queue.poll();//以t1为目标
            temp2 = queue.poll();
            temp1.val = temp1.val+temp2.val;
            if(temp1.left != null && temp2.left != null){
                queue.add(temp1.left);
                queue.add(temp2.left);
            }
            else if(temp1.left == null &&temp2.left != null){
                temp1.left =temp2.left;
            }

            if(temp1.right != null &&temp2.right != null){
                queue.add(temp1.right);
                queue.add(temp2.right);
            }
            else if(temp1.right == null &&temp2.right != null ){
                temp1.right =temp2.right;
            }
        }
        return t1;
    }
}
