package _1455检查单词是否为句中其他单纯的前缀;

public class Solution1 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        if (sentence == null || sentence.length() == 0 || searchWord == null || searchWord.length() == 0) {
            return -1;
        }
        String [] str = sentence.split(" ");
        for (int i = 0; i < str.length; i ++) {
            String s = str[i];
            //startsWith() 方法用于检测字符串是否以指定的前缀开始。
            if (s.startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}