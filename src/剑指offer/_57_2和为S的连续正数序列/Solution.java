package 剑指offer._57_2和为S的连续正数序列;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] findContinuousSequence(int target) {
        int i = 1; // 滑动窗口的左边界
        int j = 1; // 滑动窗口的右边界
        int sum = 0; // 滑动窗口中数字的和
        List<int[]> res = new ArrayList<>();

        while (i <= target / 2) {
            if (sum < target) {
                // 右边界向右移动
                sum += j;
                j++;
            } else if (sum > target) {
                // 左边界向右移动
                sum -= i;
                i++;
            } else {
                // 记录结果
                int[] arr = new int[j-i];//新建一个J-i的数组，然后填充
                //其实写成0到j-i-1，然后赋值的时候从i开始赋值，然后i++也是可以的
                //但这么写会让左边界变动，因此这个写法不可取
//                for (int k = 0; k < j-i; k++) {
//                    arr[k] = i;
//                    i++;
//                }
                for (int k = i; k < j; k++) {
                    arr[k-i] = k;
                }
                res.add(arr);
                // 左边界向右移动
                sum -= i;
                i++;
            }
        }
        //将数据填到数组中然后返回
        int[][] ans = new int[res.size()][];
        for (int m = 0; m < ans.length; m++) {
            ans[m] = res.get(m);
        }
        return ans;
    }

}
