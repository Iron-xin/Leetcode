package 程序员面试金典._面试题0102判断是否互为字符重排;

public class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        if(l1!=l2)
            return false;
        int []index=new int[128];
        for(int i=0;i<l1;i++){
            index[s1.charAt(i)]++;
            index[s2.charAt(i)]--;
        }
        for(int i=0;i<128;i++){
            if(index[i]!=0)
                return false;
        }
        return true;
    }
}