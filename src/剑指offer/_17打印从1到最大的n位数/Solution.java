package 剑指offer._17打印从1到最大的n位数;

public class Solution {
    public int[] printNumbers(int n) {
        int res = 0;
        while(n != 0){
            res = res * 10 + 9;
            n--;
        }
        int[] result = new int[res];
        for(int i = 0;i < res;i++){
            result[i] = i + 1;
        }
        return result;
    }
}
