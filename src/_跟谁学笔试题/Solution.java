package _跟谁学笔试题;

import java.util.LinkedList;

public class Solution {
    public static String reverseParentheses(String s){
        StringBuilder str = new StringBuilder();
        LinkedList<Character> list = new LinkedList<>();
        int flag = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                flag++;
                continue;
            }
            else if(s.charAt(i)==')'){
                flag--;
                continue;
            }
            if(s.charAt(i)!='('&&s.charAt(i)!=')'){
                if(flag%2==0)
                    list.add(s.charAt(i));
                else
                    list.addFirst(s.charAt(i));
            }

        }
        for(int j =0;j<list.size();j++){
            str.append(list.get(j));
        }
        return str.toString();
    }

    public static void main(String[] args){
        String s = new String("(abcd)");
        System.out.println(reverseParentheses(s));
        System.out.println(reverseParentheses("abcd"));
        System.out.println(reverseParentheses("(u(love)i)"));
    }
}
