package _58最后一个单词的长度;

public class Solution {
    public int lengthOfLastWord(String s) {
        int res = 0;
        int i = s.length() - 1;
        while(i >= 0 && s.charAt(i) == ' ')
            i--;

        while(i >= 0 && s.charAt(i) != ' '){
            i--;
            res++;
        }
        return res;
    }
}