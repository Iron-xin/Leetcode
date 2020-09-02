package _804唯一摩尔斯密码词;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        if (words == null)
            return 0;
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};

        HashSet<String> set = new HashSet<String>();
        for(int i =0; i<words.length;i++){
            StringBuilder str = new StringBuilder();
            for(int j=0;j<words[i].length();j++){
                str.append(MORSE[words[i].charAt(j)-'a']);
            }
            set.add(str.toString());

        }

        return set.size();
    }
    //高阶遍历写法
    public int uniqueMorseRepresentations1(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};

        Set<String> seen = new HashSet();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (char c: word.toCharArray())
                code.append(MORSE[c - 'a']);
            seen.add(code.toString());
        }

        return seen.size();
    }
}