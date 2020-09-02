package _654最大二叉树;
//注意边界
public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }
    public TreeNode construct(int[] nums, int left, int right) {
        if (left == right)
            return null;
        int max= max(nums, left, right);
        TreeNode root = new TreeNode(nums[max]);
        root.left = construct(nums, left, max);
        root.right = construct(nums, max + 1, right);
        return root;
    }
    public int max(int[] nums, int l, int r) {//每次都过来求一次最大值
        int max_i = l;
        for (int i = l; i < r; i++) {
            if (nums[max_i] < nums[i])
                max_i = i;
        }
        return max_i;
    }
}
