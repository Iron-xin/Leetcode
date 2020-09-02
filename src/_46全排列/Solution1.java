package _46全排列;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public List<List<Integer>> permute(int[] nums) {
        // 首先是特判
        int len = nums.length;
        // 使用一个动态数组保存所有可能的全排列
        List<List<Integer>> res = new ArrayList<>();

        if (len == 0) {
            return res;
        }

        boolean[] used = new boolean[len];
        List<Integer> path = new ArrayList<>();
        dfs(nums, len, 0, path, used, res);
        return res;
    }
        //首先是原数组，然后是深度，长度可以通过原数组获得，当然对于39题，是目标值，，然后是当前的路径，最后是总路径
    private void dfs(int[] nums, int len, int depth,List<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (depth == len) {
            res.add(new ArrayList<>(path));//这里必须是New
            return;
        }

        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;

                dfs(nums, len, depth + 1, path, used, res);
                // 注意：这里是状态重置，是从深层结点回到浅层结点的过程，代码在形式上和递归之前是对称的
                used[i] = false;
                path.remove(path.size() - 1);
            }
//            if (visited[i] == 1) continue;
//            visited[i] = 1;
//            tmp.add(nums[i]);
//            backtrack(res, nums, tmp, visited);
//            visited[i] = 0;
//            tmp.remove(tmp.size() - 1);
            //可以代替上面的for循环中的代码
        }
    }
}
//注：上面传递了5个变量，其中，length可以省略，且res作为全局变量也可以省略。也就是说，只需要3个参数
//1.整个数组，2.用来记录当前这个深度情况的List，3.深度，如果深度等于了数组长度，就说明找到最深处，可以返回了。
