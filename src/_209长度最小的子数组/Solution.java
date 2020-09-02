package _209长度最小的子数组;

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int i = 0;
        int sum = 0;
        int len = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= s) {
                if(len==0)
                    len=j-i+1;//第一次出现，更新当前len
                else
                    len=Math.min(len, j - i + 1);//否则，也是更新
                sum -= nums[i];
                i++;
            }
        }
        return len;
    }
}
