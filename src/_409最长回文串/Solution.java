package _409最长回文串;

public class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        int count =0;//统计字母出现奇数的个数
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2 !=0)
                count++;
        }
        //如过奇数个数大于1的时候，就需要将这些个数减掉（比如a b c都出现3次，就要减2）
        //因为最多允许一个字符是奇数个
        if(count>1)
            return s.length()-count+1;
        //奇数个数过少，则必定都可以构成
        return s.length();
    }
}