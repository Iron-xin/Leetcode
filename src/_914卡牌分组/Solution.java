package _914卡牌分组;

public class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        // 计数
        int[] counter = new int[10000];
        for (int i=0;i<deck.length;i++) {
            counter[deck[i]]++;
        }
        // 求gcd
        int x = 0;
        for(int j=0;j<counter.length;j++) {
            if (counter[j] > 0) {
                x = gcd(x, counter[j]);
                if (x == 1) {
                    return false;
                }
            }
        }
        return x >= 2;
    }

    // 辗转相除法
    private int gcd (int a, int b) {
        if(b==0)
            return a;
        int temp = a%b;
        return gcd(b, temp);
    }
}
