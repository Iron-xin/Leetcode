package 剑指offer._58_2左旋转字符串;

public class Solution {
    public String reverseLeftWords(String s, int n) {
        String sub = s.substring(n);//字符的前面n个不要，也是从从索引为n的开始要（索引为N的前面有N个数）
        StringBuilder sb = new StringBuilder();
        sb.append(sub);

        String sub2 = s.substring(0, n);//从索引为0开始要，要到索引为n-1的时候（n不包括的）
        sb.append(sub2);

        return sb.toString();
    }

    public String reverseLeftWords1(String s, int n) {
        StringBuilder res = new StringBuilder();
        for(int i = n; i < s.length(); i++)
            res.append(s.charAt(i));
        for(int i = 0; i < n; i++)
            res.append(s.charAt(i));
        return res.toString();
    }

    public String reverseLeftWords2(String s, int n) {
        String res = "";
        for(int i = n; i < s.length(); i++)
            res += s.charAt(i);
        for(int i = 0; i < n; i++)
            res += s.charAt(i);
        return res;
    }


}