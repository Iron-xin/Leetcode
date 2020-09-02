package _爱奇艺;

import java.util.Scanner;
import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = in.next();//a是距离
            System.out.println(aiqiyi3(a));
        }
    }
    public static boolean aiqiyi3(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] ch = s.toCharArray();
        for(int i =0; i<ch.length;i++ ){
            if(ch[i]=='(')
                stack.push(')');
            else if(ch[i]=='[')
                stack.push(']');
            else if(ch[i]=='{')
                stack.push('}');
            else if(stack.isEmpty()||ch[i]!=stack.pop())//这里将peek和Pop放在一起弄了
                return false;
        }
        return stack.isEmpty();
    }
}
