package 剑指offer._05替换空格;

import java.util.Arrays;

public class Solution {
    public String replaceSpace(String s) {
        if(s==null || "".equals(s)) return s;
        //统计空格数量
        int spaceCount = 0;
        for(int i = 0 ; i < s.length() ;i++){
            if(s.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        //由于String是不可变的，为了容纳更多的字符，需要进行扩容
        char[] result = Arrays.copyOf(s.toCharArray(), s.length()+spaceCount*2);
        //双指针
        int p1 = s.length()-1;
        int p2 = result.length-1;
        while(p1>=0){
            char c = s.charAt(p1);
            if(c ==' '){
                result[p2--] = '0';
                result[p2--] = '2';
                result[p2--] = '%';
            }else{
                result[p2--] = c;
            }
            p1--;
        }
        return new String(result);

    }
}