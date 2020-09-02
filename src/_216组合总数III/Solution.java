package _216组合总数III;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> list = new ArrayList<>();
        helper(n, k, list, 1);
        return res;
    }

    public void helper(int tar, int k, List<Integer> temp, int start) {
        if (k < 0) return;
        if (tar == 0 && k == 0) {
            res.add(new ArrayList<Integer>(temp));
        }
        for (int i = start; i <= 9; i++) {
            if (i > tar) return;
            temp.add(i);
            helper(tar - i, k - 1, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}

