package _448找到所有数组中消失的数字;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();

        //这个做法就是，如果你某个数字出现了，就把对应的索引的数字变成负的
        //最终为正的数据的索引，就是没有出现的数字（注意数组大小是n，因此是0到n-1，要做一个减1）
        for(int i=0;i<nums.length;++i) {
            int index = Math.abs(nums[i])-1;
            if(nums[index]>0) {
                nums[index] *= -1;
            }
        }
        //第二遍扫描，找到所有非负数，非负数所在的下标+1，即为缺失的数字
        for(int i=1;i<=nums.length;++i) {
            if(nums[i-1]>0) {
                res.add(i);
            }
        }
        return res;
    }
}
