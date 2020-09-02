package _131分割回文字符串;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Chris on 2020/8/24.
 */
public class Solution {
    public List<List<String>> partition(String s) {
        if(s == null){
            return new ArrayList<>();
        }
        List<List<String>> res = new ArrayList<>();
        dfs(s, 0, new ArrayList<>(), res);
        return res;
    }

    /**
     * 深度优先搜搜
     * @param s
     * @param start
     * @param temp
     * @param res
     */
    private void dfs(String s, int start, List<String> temp,  List<List<String>> res){
        //当start >= s的长度时，说明遍历已经结束，需要保存当前的分割结果
        if(start >= s.length()){
            res.add(new ArrayList<>(temp));
            return ;
        }
        for(int index = start + 1; index <= s.length(); index++){
            String current = s.substring(start, index);
            //当前子串是回文
            if(isPalindrome(current)){
                temp.add(current);
                //深度优先搜索
                dfs(s, index, temp, res);
                temp.remove(temp.size() - 1);
            }
        }
    }

    /**
     * 判断是不是回文数
     * @param s
     * @return
     */
    private boolean isPalindrome(String s){
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "aab";
        Solution solution = new Solution();
        List<List<String>> res = solution.partition(s);
        System.out.println(Arrays.toString(res.toArray()));

    }
}
