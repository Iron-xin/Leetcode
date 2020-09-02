package _103二叉树的锯齿形层次遍历;

import java.util.*;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer> > arrplus = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Stack<Integer> stack = new Stack<>();
        if(root==null)
            return arrplus;
        queue.offer(root);
        int depth=1;//第一层（同时也是深度）
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
                if(depth%2==1){//奇数层
                    arr.add(node.val);//在尾部插入，正常的顺序
                }
                if(depth%2==0){//偶数层
                    stack.push(node.val);//先放进栈
                }
            }
            while(stack.size()!=0){ //在一层的都放进栈后，在倒给数组。
                arr.add(stack.pop());
            }
            arrplus.add(arr);
            depth++;
        }
        return arrplus;
    }
}