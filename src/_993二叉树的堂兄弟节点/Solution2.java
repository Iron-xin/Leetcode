package _993二叉树的堂兄弟节点;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null)
            queue.add(root);
        int[] depths = new int[2];
        int[] fathers = new int[2];
        int a = 0;

        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            for (int i = 0;i < size;i++) {
                TreeNode first = queue.poll();
                if (first.left != null) {
                    queue.offer(first.left);
                    if (first.left.val == x || first.left.val == y) {
                        depths[a] = depth;
                        fathers[a] = first.val;
                        a++;
                    }
                }
                if (first.right != null) {
                    queue.add(first.right);
                    if (first.right.val == x || first.right.val == y ) {
                        depths[a] = depth;
                        fathers[a] = first.val;
                        a++;
                    }
                }
            }
        }
        return depths[0] == depths[1] && fathers[0] != fathers[1];
    }
}
