package _17电话号码的数字组合;

//LinkedList result = new LinkedList();
//public void backtrack(路径，选择列表){
//        if(满足结束条件){
//            result.add(结果);
//        }
//        for(选择：选择列表){
//            做出选择;
//            backtrack(路径，选择列表);
//            撤销选择;
//        }
//}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    ArrayList<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits == null ||digits.length() == 0){
            return result;
        }
        HashMap<Character,char[]> map = new HashMap<>();
        map.put('2',new char[]{'a','b','c'});
        map.put('3',new char[]{'d','e','f'});
        map.put('4',new char[]{'g','h','i'});
        map.put('5',new char[]{'j','k','l'});
        map.put('6',new char[]{'m','n','o'});
        map.put('7',new char[]{'p','q','r','s'});
        map.put('8',new char[]{'t','u','v'});
        map.put('9',new char[]{'w','x','y','z'});
        conbin(digits,0,new StringBuilder().append(""),map);
        return result;
    }
    //参数1 是为了传递长度，参数2是为了传递目前的深度， 参数3是当前的字符加到哪了，参数4是之前建立的Map集合，  参数5是最终结果集
    //因为设为成员变量，因此不用传参
    public void conbin(String digits, int depth, StringBuilder str,HashMap<Character,char[]> map){
        if(depth == digits.length()){
            result.add(str.toString());
            return ;
        }
        //选择列表
        char temp = digits.charAt(depth);
        char[] charArr = map.get(temp);
        for(int i = 0; i<charArr.length; i++){
            //做出选择
            str.append(charArr[i]);
            conbin(digits,depth+1,str,map);
            //撤销选择
            str.deleteCharAt(str.length() - 1);
        }
    }
}
