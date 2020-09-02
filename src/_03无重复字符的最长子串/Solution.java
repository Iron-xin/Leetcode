package _03无重复字符的最长子串;
//思路：
//        这道题主要用到思路是：滑动窗口
//        什么是滑动窗口？
//        其实就是一个队列,比如例题中的 abcabcbb，进入这个队列（窗口）为 abc 满足题目要求，当再进入 a，队列变成了 abca，
//        这时候不满足要求。所以，我们要移动这个队列！
//        如何移动？
//        我们只要把队列的左边的元素移出就行了，直到满足题目要求！
//
//        一直维持这样的队列，找出队列出现最长的长度时候，求出解！
//显然遍历一次就出结果，因此是O(n)
//以2345456789为例
//2，23，234，2345，3454，4545，5456，4567，45678，456789.
import java.util.Set;
import java.util.HashSet;
class Solution {
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
