package _605种花问题;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0) return true;
        int[] tmp = new int[flowerbed.length + 2];
        int len = tmp.length;
        tmp[0] = 0;
        tmp[len - 1] = 0;
        //给新数组赋值
        for(int i = 0; i < flowerbed.length; i++){
            tmp[i + 1] = flowerbed[i];
        }
        //每计算一个，需要把当前数置为1
        for(int i = 1; i < len - 1; i++){
            if(tmp[i] == 0 && tmp[i - 1] == 0 && tmp[i + 1] == 0){
                n--;
                tmp[i] = 1;
            }
            if(n == 0) return true;
        }
        return false;

    }
}