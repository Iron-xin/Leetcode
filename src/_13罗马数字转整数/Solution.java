package _13罗马数字转整数;

public class Solution {
    public int romanToInt(String s) {
        char[] ch = s.toCharArray();
        int num = 0;
        for (int i = 0; i < ch.length - 1; i++) {
            if(ch[i] == 'I' && (ch[i + 1] == 'V' || ch[i + 1] == 'X'))
                num -= 2;//特殊情况是1的后面只会接5和10
            if(ch[i] == 'X' && (ch[i + 1] == 'L' || ch[i + 1] == 'C'))
                num -= 20;//特殊情况10的后面只会接50和100
            if(ch[i] == 'C' && (ch[i + 1] == 'D' || ch[i + 1] == 'M'))
                num -= 200;//特殊情况是100后面只会接500和1000
            //当出现以上6种特殊情况时，需要做减法由于我们一般是做加法，所以这里出现特殊情况
            //需要把加上了也减去，也就是减2倍的1或者10或者100.
        }
        //下面的可以改写成if。 也可以用map存值。
        for (int i = 0; i < ch.length; i++) {
            switch (ch[i]) {
                case 'M': {
                    num += 1000;
                    continue;
                }
                case 'D': {
                    num += 500;
                    continue;
                }
                case 'C': {
                    num += 100;
                    continue;
                }
                case 'L': {
                    num += 50;
                    continue;
                }
                case 'X': {
                    num += 10;
                    continue;
                }
                case 'V': {
                    num += 5;
                    continue;
                }
                default: {
                    num += 1;
                    continue;
                }
            }
        }
        return num;
    }
}