package _1446连续字符;

public class Solution {
    public int maxPower(String s) {
        int left=0;
        int right =0;
        int count =0;
        if(s.length()==0 || s.equals(""))
            return 0;
        while(right<s.length()){
            if(s.charAt(right) == s.charAt(left) ){
                right++;
            }else{
                left=right;
                right++;
            }
            count = Math.max(count,right-left);
            //这里是先++后，再比较的，所以不用加1了。

        }
        return count;
    }
}
