package _653两数之和IV_输入BST;

import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new LinkedList<>();
        inorder(root, list);
        int i = 0;
        int j = list.size() - 1;
        while(i < j){
            int sum = list.get(i) + list.get(j);
            if (sum == k)
                return true;
            if (sum > k)
                j--;
            else i++;
        }
        return false;
    }

    private void inorder(TreeNode root, List<Integer> list){
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}