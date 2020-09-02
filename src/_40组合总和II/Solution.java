package _40组合总和II;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(new LinkedList<Integer>(), candidates, target, 0);
        return res;
    }

    private void backtrack(LinkedList<Integer> track,int[] candidates, int target, int index){
        if(target==0 && !res.contains(track)){//这里的去重是多此一举，因为后面已经去过重了。
            res.add(new LinkedList<>(track));
            return;
        }

        for(int i=index; i<candidates.length; i++){
            if(target-candidates[i]<0){
                break;
            }
            if(i > index && candidates[i] == candidates[i - 1]) continue; // 去重复

            track.add(candidates[i]);
            backtrack(track, candidates, target-candidates[i], i+1);
            track.removeLast();
        }
    }
}
