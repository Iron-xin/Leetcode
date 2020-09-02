package _67二进制求和;

public class Solution {
    public String addBinary(String a, String b) {
        int alen = a.length() - 1;
        int blen = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(alen >= 0 || blen >= 0){
            //从尾部相加
            int x = alen >= 0 ? a.charAt(alen) - '0' : 0;
            int y = blen >= 0 ? b.charAt(blen) - '0' : 0;
            sb.append((x + y + carry) % 2) ;
            carry = (x + y + carry) / 2;
            alen--;
            blen--;
        }
        if(carry == 1)
            sb.append(1);
        return sb.reverse().toString();
    }
}