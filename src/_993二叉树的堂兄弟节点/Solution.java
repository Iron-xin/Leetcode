package _993二叉树的堂兄弟节点;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null)
            return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth=0;
        int count =0;//当前已经遍历节点数量
        int nextcount =1;//下一层的数量
        int[] depths = new int[2];//利用两个数组来记录对应的深度和父节点，然后比较是否相等
        int a = 0;//a用来表述数组的某个角标
        int[] fathers = new int[2];

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            count++;
            if(node.left!=null) {
                if (node.left.val == x || node.left.val == y) {
                    depths[a] = depth+1;//这里必须要加1，是因为这个写法的层序遍历，是在遍历完某一层节点，才更新深度
                    //所以当想拿到某一个节点的深度的时候，必须要+1才是更新成当前的深度。（另一种写法是没有这个问题的）
                    fathers[a] =node.val;
                    a++;

                }
                queue.add(node.left);
            }
            if(node.right!=null){
                if (node.right.val == x || node.right.val == y) {
                    depths[a] = depth+1;
                    fathers[a] =node.val;
                    a++;
                }
                queue.add(node.right);
            }
            if(count == nextcount){
                depth++;
                count = 0;
                nextcount = queue.size();
            }
        }
        return depths[0] == depths[1] && fathers[0] != fathers[1];
    }
}
