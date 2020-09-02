package 剑指offer._48.最长不含重复字符的子字符串;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        // 右指针，初始值为0，相当于我们在字符串的左边界的左侧，还没有开始移动
        int index = 0;
        int count = 0;//记录当前遍历的字符串长度
        int result = 0;//记录整体的字符串的最长子串
        for (int i = 0; i < s.length(); i++) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符（窗口动作）
                set.remove(s.charAt(i - 1));
            }
            while (index  < s.length() && !set.contains(s.charAt(index ))) {
                // 不断地移动右指针
                set.add(s.charAt(index));
                index++;
            }
            count = index - i ;//indxe即右边界移动到了出界的情况，所以是直接减，而不用+1.
            if(result<count)
                result = count;
        }
        return result;
    }
}
