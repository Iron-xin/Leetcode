package _1389在既定顺序创建目标数组;

public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        //nums是添加的，index是指定位置的
        //向index[i]这个位置，添加nums[i]这个元素

        for(int i=0; i<nums.length; i++) {
            //如果某个位置比遍历的i要小，就说明是个插入动作，需要移动元素
            if(index[i] < i){
                for(int j=i; j>index[i]; j--) {
                    target[j] = target[j - 1];
                }
            }
            //否则就是个直接赋值动作
            target[index[i]] = nums[i];
        }
        return  target;
    }
}