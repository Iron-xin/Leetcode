package _739每日温度;

public class Solution {
    public int[] dailyTemperatures(int[] T) {
        //先建一个数组，和T的长度相同
        int[] A = new int[T.length];
        //设置一个初始天数 =0
        //双指针，i从第一个数开始，j从i下一个数开始，如果j的值大于i的值，则把两者的差值放到数组里、跳出循环
        for(int i = 0 ; i < T.length ; i ++){
            for(int j = i + 1 ; j < T.length ; j ++){
                if(T[j] > T[i]){
                    A[i] = j - i;
                    break;
                }
            }
        }
        return A;
    }
}
