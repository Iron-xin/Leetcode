package _1370上升下降字符串;

public class Solution {
    public String sortString(String s) {
        int[] arr = new int[26];// 序号+97是字母，数值是剩余个数
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 97]++;//小写字母a是97，减97变成索引0 这一步用来统计每个字符出现多少次
        }
        // 统计完了所有的字符
        int left = s.length();
        StringBuffer sb = new StringBuffer();
        while (left > 0) {
            for (int i = 0; i < 26; i++) {
                if (arr[i] != 0) {
                    char c = (char) (i + 97);
                    sb.append(c);
                    arr[i]--;//数量减1
                    left--;//指针更新
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (arr[i] != 0) {
                    char c = (char) (i + 97);
                    sb.append(c);
                    arr[i]--;
                    left--;
                }
            }
        }
        return sb.toString();
    }
}
