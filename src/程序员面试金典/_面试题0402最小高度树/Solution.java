package 程序员面试金典._面试题0402最小高度树;
//就是二分后的节点就是当前子树的头结点，利用这个特性调用。每次二分

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length);//注意这个边界条件，num.length恰好是取不到的
        //如果该哼length-1，后面的left等于right应该返回nums[left]，后面的递归也改为left到mid-1
    }
    private TreeNode helper(int[] nums,int left,int right){
        if(left==right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums,left,mid);
        node.right = helper(nums,mid+1,right);
        return node;
    }
}