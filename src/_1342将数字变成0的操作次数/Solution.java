package _1342将数字变成0的操作次数;

public class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                num = num - 1;
            } else {
                num = num / 2;
            }
            steps++;
        }
        return steps;
    }
}