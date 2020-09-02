package _11盛最多水的容器;

public class Solution2 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;//左右边界
        int max = 0;
        int result = 0;//局部最大和整体最大
        while(left<right){
            max = Math.min(height[left],height[right])*(right-left);
            if(max>result)
                result = max;
            if(height[left] < height[right])
                //移动规则是，一长一短，由于我们要拿到最大的面积，而面积由最小的决定，因此我们要改变最小的长度
                //因此，每次指针是移动断的那边。
                left++;
            else
                right--;
        }
        return result;
    }
}
