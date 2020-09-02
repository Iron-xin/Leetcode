package 剑指offer._11旋转数组的最小数字;

public class Solution2 {

    public int minArray(int[] numbers) {
        int i = 0;
        int j = numbers.length-1;
        while(i<j){
            int m = (i+j)/2;
            if(numbers[m]>numbers[j]){//说明m在左边增长数组中,此时旋转点在(m,j]
                i = m+1;
            }else if(numbers[m]<numbers[j]){//说明在右边增长数组中,此时旋转点在[i,m]
                j = m;
            }else {//相等了
                j--;
            }
        }
        return numbers[i];
    }
}