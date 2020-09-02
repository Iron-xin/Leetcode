package _09回文数;

public  class Solution2 {
    public boolean isPalindrome(int x) {
        if(x<0){ // 如果为负数，直接返回 false
            return false;
        }
        String strNum = String.valueOf(x);
        int i=0;
        int j=strNum.length()-1;
        while(i<=j){
            if(strNum.charAt(i)!=strNum.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}