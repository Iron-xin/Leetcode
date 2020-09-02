package _872叶子相似的树;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        getRoot(root1, result1);
        getRoot(root2, result2);
        if (result1.size() != result2.size()) {
            return false;
        }
        for (int i = 0; i < result1.size(); i++) {
            if (result1.get(i) != result2.get(i)) {
                return false;
            }
        }
        return true;
    }
    public void getRoot(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            result.add(root.val);
            return;
        }
        getRoot(root.left, result);
        getRoot(root.right, result);
    }
}