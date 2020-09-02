package _128最长连续序列;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }
        int ans = 0;
        for (int i=0;i<nums.length;i++) {
            //如果对于某个数a，集合中没有a+1时，，那么就统计以这个数最大的时候的最长连续序列。即向前找，也可以向后找
            //这样可以避免重复的查找，比如345和78，当i=3时不会进入，直到i=5才会算543这个序列，然后接着跳过。
            //因此从0到a这个范围中，
            if (!set.contains(nums[i]+1)) {
                int l = 0;//统计个数
                int t = nums[i];
                while (set.contains(t)) {
                    l++;
                    t--;
                }
                ans = Math.max(ans, l);
            }
        }
        return ans;
    }
}