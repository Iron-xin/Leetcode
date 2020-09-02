package _81搜索旋转排序数组II;

public class Solution {
    public boolean search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target)//相等就找到了
                return true;
            if(nums[start]<nums[mid]){//如果比左边大，左侧有序
                if(nums[mid]>=target&&target>=nums[start]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else if(nums[end]>nums[mid]){//如果右侧有序
                if(nums[mid]<=target&&target<=nums[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{ //相等就两边向中间压缩，这里也可以用while写
                if(nums[mid]==nums[start])
                    start++;
                else
                    end--;
            }
        }
        return false;
    }
}