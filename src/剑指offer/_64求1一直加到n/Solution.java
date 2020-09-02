package 剑指offer._64求1一直加到n;

class Solution {
    public int sumNums(int n) {
        int sum = n;
        boolean ans = (n>0)&&((sum+=sumNums(n-1))>0);
        // boolean ans = (n>0)&&((sum+=sumNumsm(n-1))!=0);
        return sum;
    }
}