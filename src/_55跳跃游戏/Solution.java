package _55跳跃游戏;

public class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int right = 0;//能到达的最大值
        for (int i = 0; i < n; i++) {
            if (i <= right) {
                //我们比较每一个i的情况，看i位置的情况。进入这个if，说明当前位置可以到达
                //否则,right比i小，说明到达不了，则意味后边的都是false了。可以剪枝，但这里没有.剪枝就是提前到return false
                if(right < i+nums[i])//这里判断i位置的数字能不能近一步扩大，
                    right = i + nums[i];//运行这一步说明可以扩大
                //不扩大也没关系，可以有i位置后边的数扩大，我们将i++，比较下一个元素的情况了
                //如果扩大了，要比较是否成功，不然就进入下一步，刚刚提到的i++
                if (right >= n - 1) {//大于右边界nums.length-1。成功了
                    return true;
                }
            }
        }
        return false;
    }
}
