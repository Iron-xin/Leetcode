package _1021删除最外层的括号;

public class Solution {
    public String removeOuterParentheses(String S) {

        int left = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '('){
                if(left>0){
                    res.append('(');
                }
                left++;
            }

            if (S.charAt(i) == ')' ){
                left--;
                if(left>0)
                    res.append(')');
            }

        }
        return res.toString();
    }
}
