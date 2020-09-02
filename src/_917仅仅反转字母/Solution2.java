package _917仅仅反转字母;

public class Solution2 {
    public String reverseOnlyLetters(String S) {
        int low=0;
        int high = S.length()-1;
        char[] res = S.toCharArray();
        while(low<high){
            if(isTrue(res[low])&&isTrue(res[high])){
                char temp = res[low];
                res[low] = res[high];
                res[high] = temp;
                low++;
                high--;
            }
            if(!isTrue(res[low])){
                low++;
            }
            if(!isTrue(res[high])){
                high--;
            }
        }
        return new String(res);
    }

    boolean isTrue(char ch){
        if(ch>='a'&&ch<='z'){
            return true;
        }
        if(ch>='A'&&ch<='Z'){
            return true;
        }
        return false;
    }
}