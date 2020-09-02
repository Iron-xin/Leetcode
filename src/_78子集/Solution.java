package _78子集;
//从前往后遍历, 遇到一个数, 之前的所有集合添加上这个数组成新的子集.
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());//需要添加一个空集
        for (int i = 0; i < nums.length; i++) {
            int all = res.size();//拿到之前所有集合的个数，以后对每个集合都添加新元素用的上
            for (int j = 0; j < all; j++) {
                List<Integer> tmp = new ArrayList<>(res.get(j));
                tmp.add(nums[i]);
                res.add(tmp);
            }
        }
        return res;
    }
}

