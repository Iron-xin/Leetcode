package 程序员面试金典._面试题0109字符串轮转;

public class Solution
{
    public boolean isFlipedString(String s1, String s2)
    {
        if(s1.length()!=s2.length())return false;
        if(s1.equals(s2))return true;
        s1+=s1;
        return s1.contains(s2);
    }
}