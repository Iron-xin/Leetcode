package _47全排列II;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        int len = nums.length;

        if (len == 0) {
            return res;
        }

        // 排序（升序或者降序都可以），排序是剪枝的前提
        Arrays.sort(nums);

        boolean[] used = new boolean[len];

        List<Integer> path = new ArrayList<>(len);
        dfs(nums, len, 0, used, path);
        return res;
    }

    private void dfs(int[] nums, int len, int depth, boolean[] used, List<Integer> path) {
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; ++i) {
            if (used[i]) {
                continue;
            }

            // 剪枝条件：i > 0 是为了保证 nums[i - 1] 有意义
            // 写 !used[i - 1] 是因为 nums[i - 1] 在深度优先遍历的过程中刚刚被撤销选择
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            path.add(nums[i]);
            used[i] = true;

            dfs(nums, len, depth + 1, used, path);
            // 回溯部分的代码，和 dfs 之前的代码是对称的
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int[] nums = {1, 1, 2};
//        List<List<Integer>> res = solution.permuteUnique(nums);
//        System.out.println(res);
//    }
