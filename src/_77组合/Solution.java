package _77组合;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (n <= 0 || k <= 0) {
            return result;
        }
        dfs(result, new ArrayList<Integer>(), 1, n, k);
        return result;
    }


    private void dfs(List<List<Integer>> result, ArrayList<Integer> list, int index, int n, int k) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
        }
        for (int i = index; i <= n; i++) {
            list.add(i);

            dfs(result, list, i + 1, n, k);
            list.remove(list.size() - 1);
        }
    }
}
