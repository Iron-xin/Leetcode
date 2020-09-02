package _90子集II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    List<List<Integer>> ans;
    List<Integer> tmp;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans = new ArrayList<>();
        tmp = new ArrayList<>();
        int l = nums.length;
        if (l == 0) return ans;
        Arrays.sort(nums);
        dfs(0, nums);
        return ans;
    }
    private void dfs(int i, int[] nums) {

        ans.add(new ArrayList<>(tmp));
        for (int j = i; j < nums.length; j++) {
            //这个j大于i很关键，如果大于，且相等，才跳过，也就意味着，对于1，2，2，起始是1，加了2后，再加2时
            //j=i=2，因此此时不跳过，形成122，如果回溯时，只有回溯到i=0，时，size=2，此时加了一个2，第二次再加2
            //就会形成j>i的情况，则此时才跳过。
            if (j > i && nums[j] == nums[j-1]) continue;
            tmp.add(nums[j]);
            dfs(j+1, nums);
            tmp.remove(tmp.size()-1);
        }
    }
}