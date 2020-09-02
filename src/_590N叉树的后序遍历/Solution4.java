package _590N叉树的后序遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//更好的写法
public class Solution4 {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;
        Stack<Node> stack = new Stack<Node>();
        Stack<Node> stack2 = new Stack<Node>();
        Node pre = null;
        stack.push(root);
        while(!stack.isEmpty()){
            Node curr = stack.pop();
            stack2.push(curr);
            for(int i=0;i<curr.children.size();i++){//子节点入栈，弹出的时候就是逆序了
                stack.push(curr.children.get(i));
            }
        }
        while(!stack2.isEmpty()){
            res.add(stack2.pop().val);
        }
        return res;
    }
}