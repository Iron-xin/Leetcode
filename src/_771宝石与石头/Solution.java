package _771宝石与石头;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        if (J == null || S == null) return 0;
        char[] A = J.toCharArray();
        char[] B = S.toCharArray();
        boolean[] map = new boolean[128];
        for(int i = 0; i < A.length; ++i) {
            map[A[i]] = true;
        }
        int count = 0;
        for (int i = 0; i < B.length; ++i) {
            if (map[B[i]]) {
                count++;
            }
        }
        return count;
    }
}