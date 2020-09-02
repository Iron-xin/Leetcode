package _387字符串中的第一个唯一字符;

public class Solution {
    public int firstUniqChar(String s) {
        int[] result = new int[26];
        for (int i = 0; i < s.length(); i++) {
            result[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (result[s.charAt(i) -'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
    public int firstUniqChar1(String s) {
        int[] result = new int[26];
        for(int i = 0; i < result.length; i++){
            result[i] = -1;
        }
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            if(result[s.charAt(i) - 'a'] != -1)
                result[s.charAt(i) - 'a']=-2;
            else
                result[s.charAt(i) - 'a']=i;
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] >=0 ) {
                res=Math.min(res,result[i]);
            }
        }
        if(res!=Integer.MAX_VALUE)
            return res;
        return -1;
    }
}