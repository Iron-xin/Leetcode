package _113路径之和II;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        findroad(result,list,root,sum);
        return result;
    }
    public void findroad(List<List<Integer>> result,List<Integer> list,TreeNode root,int sum){
        if(root == null) return;
        list.add(root.val);
        if(sum == root.val && root.left == null && root.right == null){
            result.add(new ArrayList<>(list));
        }
        findroad(result,list,root.left,sum-root.val);

        findroad(result,list,root.right,sum-root.val);
        list.remove(list.size()-1);
    }
}