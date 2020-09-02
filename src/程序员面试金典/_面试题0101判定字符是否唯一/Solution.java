package 程序员面试金典._面试题0101判定字符是否唯一;

public class Solution {
    public boolean isUnique(String astr) {
        int[] temp = new int[128];
        for(int i=0;i<astr.length();i++){
            char s = astr.charAt(i);
            if(temp[s] == 1){
                return false;
            }
            temp[s] = 1;
        }
        return true;
    }
}