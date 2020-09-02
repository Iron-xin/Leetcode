package _559N叉树的最大深度;

import java.util.LinkedList;

public class Solution3 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        //BFS的层次遍历思想，记录二叉树的层数，
        //遍历完，层数即为最大深度
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);
        int maxDepth = 0;
        while (!queue.isEmpty()) {
            maxDepth++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                for(int j = 0; j < node.children.size(); j++){
                    queue.offer(node.children.get(j));
                }
            }
        }
        return maxDepth;
    }
}