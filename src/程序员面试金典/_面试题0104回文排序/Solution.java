package 程序员面试金典._面试题0104回文排序;

public class Solution {
    public boolean canPermutePalindrome(String s) {
        if (s == null || s.length() < 1) {
            return false;
        }
        char[] chars = s.toCharArray();//这里没有用字符数组，但是很多人都用字符数组
        int[] arr = new int[128];
        int count =0;//记录基础的个数
        for(int i=0;i<s.length();i++){
            arr[chars[i]]++;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2 ==1)
                count++;
        }
        if(count>1)
            return false;

        return true;
    }
}
