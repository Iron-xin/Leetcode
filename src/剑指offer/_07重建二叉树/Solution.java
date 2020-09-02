package 剑指offer._07重建二叉树;

import java.util.HashMap;

public class Solution {
    HashMap<Integer, Integer>  map = new HashMap<>();
    int[] arr;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        arr = preorder;
        for(int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);
        return recur(0, 0, inorder.length - 1);
    }
    public TreeNode recur(int pre_root, int in_left, int in_right) {
        if(in_left > in_right) return null;
        TreeNode root = new TreeNode(arr[pre_root]);
        int i = map.get(arr[pre_root]);
        root.left = recur(pre_root + 1, in_left, i - 1);
        root.right = recur(pre_root + i - in_left + 1, i + 1, in_right);
        return root;
    }
}