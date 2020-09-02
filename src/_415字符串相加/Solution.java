package _415字符串相加;

public class Solution {
    public String addStrings(String num1, String num2) {
        int alen = num1.length() - 1;
        int blen = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(alen >= 0 || blen >= 0){
            //从尾部相加
            int x = alen >= 0 ? num1.charAt(alen) - '0' : 0;
            int y = blen >= 0 ? num2.charAt(blen) - '0' : 0;
            sb.append((x + y + carry) % 10) ;
            carry = (x + y + carry) / 10;
            alen--;
            blen--;
        }
        if(carry == 1)
            sb.append(1);
        return sb.reverse().toString();
    }
}
