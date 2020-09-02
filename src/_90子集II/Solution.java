package _90子集II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    ArrayList<List<Integer>> res=new ArrayList<>();
    ArrayList<Integer> array=new ArrayList<>();//一个可能的子集
    int n;
    int [] nums;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.nums=nums;
        n=nums.length;
        //先排序，这样相同的两个元素必相邻
        Arrays.sort(nums);
        backtarck(0);
        res.add(new ArrayList<Integer>());//补上一个空集
        return res;
    }
    private void backtarck(int i){//将要填入下标为i的元素，也就是说该层从nums[i]处的元素开始for循环
        if(i==n){
            return;
        }
        //再dfs地加子节点
        for(int j=i;j<n;j++){//做的是子集，子集是组合，所以是从当前元素开始遍历
            if(j>i&&nums[j]==nums[j-1])
                continue;//同层重复，跳过
            array.add(nums[j]);
            res.add(new ArrayList<Integer>(array));
            backtarck(j+1);
            array.remove(array.size()-1);//撤销选择

        }
    }
}