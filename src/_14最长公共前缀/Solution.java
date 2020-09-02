package _14最长公共前缀;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length() ; i++) {
            // 取出当前位置要匹配的字符。
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    //说明第i个出现不同，则截取前i个直接返回，从0到i，但是i位置不取，因此可以取出一共i个元素
                    return strs[0].substring(0, i);
                }
            }
        }
        // 数组中其它字符串都能被 strs[0] 匹配。
        return strs[0];
    }
}
//这是一个纵向写法，即每次都取所有元素的第i个元素，感觉比横向写法要好，虽然时间复杂度相同
