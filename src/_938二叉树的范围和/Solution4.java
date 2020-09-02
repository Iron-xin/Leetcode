package _938二叉树的范围和;

import java.util.ArrayList;
import java.util.List;

public class Solution4 {
    ArrayList<Integer> list = new ArrayList<>();

    public int rangeSumBST(TreeNode root, int L, int R) {
        preOrderSearch(root);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= L &&list.get(i) <= R) {
                sum += list.get(i);
            }
        }
        return sum;
    }

    private void preOrderSearch(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrderSearch(root.left);
        list.add(root.val);
        preOrderSearch(root.right);
    }
}
