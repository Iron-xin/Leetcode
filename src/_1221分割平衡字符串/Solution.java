package _1221分割平衡字符串;

public class Solution {
    public int balancedStringSplit(String s) {
        int countL =0;
        int countR =0;
        int res =0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == 'L')
                countL++;
            else
                countR++;
            if(countL==countR){
                res++;
                countL=0;
                countR=0;
            }

        }
        return res;
    }
}