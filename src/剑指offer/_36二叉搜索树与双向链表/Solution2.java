package 剑指offer._36二叉搜索树与双向链表;

import java.util.Stack;

public class Solution2 {
    public Node treeToDoublyList(Node root) {
        if(root==null)
            return null;
        Stack<Node> stack = new Stack<Node>();
        Node head = null;//head只是记录双向链表的首个节点
        Node pre = null;// 用于保存中序遍历序列的上一节点

        while(root!=null||!stack.isEmpty()){
            if(root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();//此时左子树遍历完了，弹出栈顶元素
                if(pre == null){ //pre初始值是null
                    pre = root;//因此将弹出的第一个节点，也就是序列的最左边的树赋值
                    head = root;
                }
                else {//进入这个else时，说明至少是第2个节点，此时进行连接。
                    pre.right = root;
                    root.left = pre;
                    pre = root;
                }
                root = root.right;//遍历完左子树后，应该向右走了
            }
        }
        pre.right = head;
        head.left = pre;
        return head;
    }
}

