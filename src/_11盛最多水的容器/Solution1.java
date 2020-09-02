package _11盛最多水的容器;
//暴力法
public class Solution1 {
    public int maxArea(int[] height) {
        int max = 0;
        int result=0;
        for(int i=0;i<height.length;i++){
            for(int j=height.length-1;j>=i;j--){
                max = Math.min(height[i],height[j])*(j-i);//取两个边界中较小值，和下标差做乘法
                if(max>result)
                    result = max;
            }
        }
        return result;
    }
}