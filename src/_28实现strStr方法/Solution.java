package _28实现strStr方法;

public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        if(needle.length()>haystack.length()) return -1;
        int j,temp;
        for(int i=0;i<haystack.length();i++){
            j=0;
            temp=i;
            if(haystack.charAt(i)==needle.charAt(j)){//首字母相等时，比较后续
                while(j<needle.length()){
                    if(temp>=haystack.length())
                        return -1;
                    if(haystack.charAt(temp)==needle.charAt(j)){
                        if(j==needle.length()-1)
                            return i;
                        temp++;
                        j++;
                    }else break;
                }
            }
        }
        return -1;
    }
}