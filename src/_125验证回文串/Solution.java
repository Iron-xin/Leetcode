package _125验证回文串;

public class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()<=1)
            return true;
        char[] ch = s.toLowerCase().toCharArray();//转换陈小写
        int left =0;
        int right =ch.length-1;
        while(left<right){

            while(left<right &&ch[left]<'0'||(ch[left]>'9'&&ch[left]<'a')||ch[left]>'z'){
                left++;
            }
            while(left<right&&ch[right]<'0'||(ch[right]>'9'&&ch[right]<'a') ||ch[right]>'z'){
                right--;
            }
            if(ch[left]==ch[right]){
                left++;
                right--;
            }else
                return false;

        }
        return true;
    }
}
