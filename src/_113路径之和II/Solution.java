package _113路径之和II;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        pathSum(ans, path, root, 0, sum);
        return ans;
    }
    public void pathSum(List<List<Integer>> ans, List<Integer> path, TreeNode root, int temp, int sum){
        if(root == null){
            return ;
        }
        if(root.left == null && root.right == null && temp+root.val == sum){
            path.add(root.val);
            ans.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return ;
        }
        path.add(root.val);
        pathSum(ans, path, root.left, temp+root.val, sum);
        pathSum(ans, path, root.right, temp+root.val, sum);
        path.remove(path.size() - 1);
    }
}


