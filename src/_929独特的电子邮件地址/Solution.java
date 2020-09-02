package _929独特的电子邮件地址;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numUniqueEmails1(String[] emails) {
        if(emails.length < 1) return 0;

        Set<String> set = new HashSet<>();
        for(int i = 0; i < emails.length; i++){
            String[] strs = emails[i].split("@");//将字符通过@分割开。
            StringBuilder sb = new StringBuilder("");
            for(int j = 0; j < strs[0].length(); j++){
                if(strs[0].charAt(j) == '.'){
                    continue;
                }
                if(strs[0].charAt(j) == '+'){
                    break;
                }
                sb.append(strs[0].charAt(j));
            }
            //后面的不处理，直接加
            set.add(sb.append("@").append(strs[1]).toString());
        }
        return set.size();
    }
    //下面是最原始的写法
    public int numUniqueEmails(String[] emails) {
        Set<String> res = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < emails[i].length(); j++) {
                char c = emails[i].charAt(j);
                if (c == '@') {
                    sb.append(emails[i].substring(j));
                    res.add(sb.toString());//只用记录从@往后的所有字符即可（之前的都添加了）
                    break;
                } else if (c == '+') {//找到了+号后，+前面的添加，+后面到@的都不添加
                    //因为后面的都不添加，所以不能简单的跳下一个字符，而是单独来处理了
                    while (emails[i].charAt(j) != '@') {
                        j++;
                    }
                    sb.append(emails[i].substring(j));
                    res.add(sb.toString());
                } else if (c == '.') {//碰到点是不用处理的
                    continue;
                } else {
                    //普通字符，直接添加
                    sb.append(c);
                }
            }
        }
        return res.size();
    }

}