package _39组合总和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> cur, int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(cur));
        }
        for (int i = start; i < candidates.length; i++) {
            if (target < candidates[i])
                continue;//如果target<当前数，则跳过
            cur.add(candidates[i]);
            dfs(result, cur, candidates, target - candidates[i], i);
            cur.remove(cur.size() - 1);
        }
    }
}
//使用全局变量
class Solution2 {
    List<List<Integer>> res =  new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> track = new LinkedList<>();
        Arrays.sort(candidates);
        backtrack(candidates, 0, target, track);
        return res;
    }
    //由于使用了全局，因此res可以不用写在方法中
    //方法中应该包含排序后的数组，当前遍历到哪个数字了的索引，以及目标值target，以及当前的记录的之前的情况的list容器
    private void backtrack(int[] candidates, int start, int target, LinkedList<Integer> track) {
        if (target < 0) return;
        if (target == 0){
            res.add(new LinkedList<>(track));
            return;
        }
        for(int i = start;i < candidates.length;i++){
            if(target < candidates[i])
                continue;//这里用break更好
            track.add(candidates[i]);
            backtrack(candidates,i,target-candidates[i],track);
            track.removeLast();
        }
    }
}
