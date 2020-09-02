package _1071字符串的最大公因子;

public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // 假设str1是N个x，str2是M个x，那么str1+str2肯定是等于str2+str1的。
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        // 辗转相除法求gcd。
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private int gcd(int a, int b) {//b是取模后的余数，余数为0，则a就是最小公约数
        if(b==0)
            return a;
        return gcd(b, a % b);
    }
}
// int gcd(int m,int n)
// {   if(n == 0){
//         return m;
//     }
//     int r = m%n;
//     return gcd(n,r)
// }