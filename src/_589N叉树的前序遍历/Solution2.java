package _589N叉树的前序遍历;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Solution2 {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        if(root == null)
            return list;
        stack.push(root);

        while(!stack.isEmpty()){
            Node node = stack.pop();
            list.add(node.val);
            for(int i=node.children.size()-1;i>=0;i--){//注意压栈顺序
                stack.push(node.children.get(i));
            }
        }
        return  list;
    }
}
