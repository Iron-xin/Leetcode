package _559N叉树的最大深度;

import java.util.LinkedList;
import java.util.Queue;


//深度只有栈
public class Solution2 {
    public int maxDepth(Node root) {
        int depth = 0;
        Queue<Node> queue = new LinkedList<>();
        if(root == null)
            return 0;
        queue.offer(root);
        int count =0;
        int nextcount = 1;
        while(!queue.isEmpty()){
            Node node = queue.poll();
            count++;
            for(int i = 0; i < node.children.size(); i++){
                queue.offer(node.children.get(i));
            }
            if(count == nextcount){
                nextcount = queue.size();
                count = 0;
                depth++;
            }
        }
        return depth;
    }
}
