package _15三数之和;

import java.util.*;

//思路，取I位置，然后从i的右侧开始移动，从i+1到length-1的位置。双指针。
//如果是i的两侧，则会进行重复计算。所以必须是i的右侧。
//如果不去重，需要用到LinkedHashSet去重
public class Solution {
    public  List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        if(nums == null || nums.length < 3)
            return ans;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] > 0)
                break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if (i > 0 && nums[i] == nums[i - 1])
                continue; // 去重
            int L = i + 1;
            int R = nums.length - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    ans.add(list);
                    while (L < R && nums[L] == nums[L + 1])
                        L++; // 去重
                    while (L < R && nums[R] == nums[R - 1])
                        R--; // 去重
                    L++;
                    R--;
                }
                else if (sum < 0)
                    L++;
                else if (sum > 0)
                    R--;
            }
        }
        return ans;
    }
}
//下面的是暴力解法
//    private List<List<Integer>> directlySolution(int[] nums) {
//        if (nums == null || nums.length <= 2) {
//            return Collections.emptyList();
//        }
//        Arrays.sort(nums);
//        Set<List<Integer>> result = new LinkedHashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                for (int k = j+1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        List<Integer> value = Arrays.asList(nums[i], nums[j], nums[k]);
//                        result.add(value);
//                    }
//                }
//            }
//        }
//
//        return new ArrayList<>(result);
//    }
//
//作者：wang-zi-hao-zain
//        链接：https://leetcode-cn.com/problems/3sum/solution/san-shu-zhi-he-javajian-ji-ti-jie-by-wang-zi-hao-z/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
