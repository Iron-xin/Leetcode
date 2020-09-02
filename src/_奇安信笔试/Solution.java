package _奇安信笔试;

import java.util.*;


public class Solution {
    /**
     * 返回亲7数个数
     * @param digit int整型一维数组 组成亲7数的数字数组
     * @return int整型
     */
    public static int reletive_7 (int[] digit) {
        // write code here
        List<List<Integer>> res = new ArrayList<>();
        int len = digit.length;
        // 使用一个动态数组保存所有可能的全排列
       int count =0;

        if (len == 0) {
            return 0;
        }

        boolean[] used = new boolean[len];
        List<Integer> path = new ArrayList<>();
        dfs(digit, len, 0, path, used, res);


        for(int i=0;i<res.size();i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<res.get(i).size();j++){

                sb.append(res.get(i).get(j));

            }
            int a = Integer.valueOf(sb.toString());
            System.out.println(a);
            if(a%7==0)
                count++;
            System.out.println(res.get(i).toString());
        }

        return count;
    }

    private static void dfs(int[] nums, int len, int depth,List<Integer> path, boolean[] used, List<List<Integer>> res) {
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
        }
    }
    public static void main(String[] args){
        int[] a = new int[]{1,2,1};

        System.out.println(reletive_7(a));
    }
}