package _459重复的子字符串;

public class Solution1 {
    public boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i < s.length(); i++) {//每次比较的是i个数
            boolean flag = true;
            if (s.length() % i == 0) {//只有能被整除时，才比较
                for (int j = i; j < s.length(); j += i) {//j是某次比较的时候，i个数的起始索引
                    for (int k = 0; k < i; k++) {//k是这i个数中，逐位比较的索引
                        if (s.charAt(0 + k) != s.charAt(j + k)) {
                            flag = false;
                            break;//这个break只是跳到了下一个j次比较，而不是到了整数比较。只有这个break击败75%
                        }
                    }
                    if(flag==false)//这里的break跳到i变化。击败85%
                        break;
                }
                if (flag == true) {
                    return true;
                }
            }
        }
        return false;
    }
}
