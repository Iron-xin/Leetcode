package _1332删除回文子序列;

public class Solution {
    public int removePalindromeSub(String s) {

        int result=0;
        if (s.contains("a"))
            result++;
        if (s.contains("b"))
            result++;
        StringBuffer stringBuffer=new StringBuffer(s);
        stringBuffer.reverse();
        if (s.equals(stringBuffer.toString())&&stringBuffer.length()>0)
            return 1;
        return result;

    }
}