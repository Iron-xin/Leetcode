package 程序员面试金典._面试题0103URL化;

public class Solution2 {
    public String replaceSpaces(String S, int length) {
        char[] cs = S.toCharArray();
        int i = length-1;
        int j = S.length()-1;
        char c;
        while(i >=0){
            c = S.charAt(i);
            if(c == ' '){
                cs[j] = '0';
                cs[j-1] = '2';
                cs[j-2] = '%';
                j=j-3;
            } else {
                cs[j--] = c;
            }
            i--;
        }
        return String.valueOf(cs,j+1, S.length()-j-1);
        //从J+1开始，一共记录S.length()-j-1这么多个

    }
}