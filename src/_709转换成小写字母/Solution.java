package _709转换成小写字母;

public class Solution {
    public String toLowerCase(String str) {
        if (str == null && "".equals(str)) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' &&str.charAt(i)<='Z')
                sb.append((char)(str.charAt(i)+32));
            else
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public String toLowerCase1(String str) {
        if (str == null && "".equals(str)) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c + 32));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}