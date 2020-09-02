package _590N叉树的后序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution3 {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new LinkedList<>();
        if(root == null)
            return res;
        Stack<Node> stack = new Stack<Node>();
        Node pre = null;
        stack.push(root);
        while(!stack.isEmpty()){
            Node curr = stack.peek();
            res.add(0,stack.pop().val);//弹出的入res。头插。使用链表
            for(int i=0;i<curr.children.size();i++){//子节点入栈，弹出的时候就是逆序了
                stack.push(curr.children.get(i));
            }

        }
        return res;
    }
}
