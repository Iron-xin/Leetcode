package _520检测大写字母;

public class Solution2 {
    public boolean detectCapitalUse(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }
        if(word.length() == 1)
            return true;
        char[] ch = word.toCharArray();
        int count = 0;
        if(ch[0]<'A' ||ch[0]>='Z'){
            for (int i = 1; i < word.length(); i++) {
                if(ch[i]<'A' ||ch[i]>'Z')
                    continue;
                else
                    return false;

            }
        }else{
            //否则，第一位大写后，后面的要么全部小写，要么全部大写
            if(ch[1]<'A' ||ch[1]>'Z') {
                for (int i = 2; i < word.length(); i++) {
                    if(ch[i]<'A' ||ch[i]>'Z')
                        continue;
                    else
                        return false;
                }
            }else{
                for (int i = 2; i < word.length(); i++) {
                    if(ch[i]>='A' &&ch[i]<='Z')
                        continue;
                    else
                        return false;
                }
            }

        }
        return true;
    }
}
