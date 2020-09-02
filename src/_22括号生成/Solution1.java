package _22括号生成;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    // 做减法
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        // 特判
        if (n == 0) {
            return res;
        }
        // 执行深度优先遍历，搜索可能的结果
        dfs("", n, n, res);
        return res;
    }
//left表示还需要添加左括号的数量。right表示还需要添加的右括号数量
    private void dfs(String s, int left, int right, List<String> res) {
        // 因为每一次尝试，都使用新的字符串变量，所以无需回溯
        // 在递归终止的时候，直接把它添加到结果集即可，注意与「力扣」第 46 题、第 39 题区分
        if (left == 0 && right == 0) {
            res.add(s);
            return;
        }
        // 剪枝（剩余的左括号数量必须比右括号数量小，或者等于，否则剪枝）
        if (left > right) {
            return;
        }

        if (left > 0) {
            dfs(s + "(", left - 1, right, res);
        }

        if (right > 0) {
            dfs(s + ")", left, right - 1, res);
        }
    }
}
//如果res设计成全局变量，设计的递归函数就可以不用传递res这个参数了。
class Solution2 {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs(n, n, "");
        return res;
    }

    private void dfs(int left, int right, String curStr) {
        if (left == 0 && right == 0) { // 左右括号都不剩余了，递归终止
            res.add(curStr);
            return;
        }

        if (left > 0) { // 如果左括号还剩余的话，可以拼接左括号
            dfs(left - 1, right, curStr + "(");
        }
        if (right > left) { // 如果右括号剩余多于左括号剩余的话，可以拼接右括号
            dfs(left, right - 1, curStr + ")");
        }
        //也就是说，left>0就可以添加左，而riht>left才可以添加右。即左括号添加的数量比右边的多时，才能添加右。
    }
}

