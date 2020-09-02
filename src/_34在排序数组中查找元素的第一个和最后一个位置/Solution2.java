package _34在排序数组中查找元素的第一个和最后一个位置;

public class Solution2 {
    public int[] searchRange(int[] nums, int target) {
        assert nums!= null;
        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        //找左右
        int[] res = new int[]{findLeft(nums, target),findRight(nums, target)};
        return res;
    }


    private int findLeft(int[] nums, int target){
        int len = nums.length;
        int res = -1;
        int start = 0;
        int end = len - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] < target){
                start = mid + 1;
            }
            //这里是把等于和小于的代码合并了，否则下面还可以分成两个部分
            else {//这是mid大于等于的情况，由于是找左边，所以要一直向最左边找
                if(nums[mid] == target){
                    res = mid;
                }
                end = mid - 1;
            }
        }
        return res;
    }

    private int findRight(int[] nums, int target){
        int len = nums.length;
        int res = -1;
        int start = 0;
        int end = len - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] > target){
                end = mid - 1;
            }
            else {
                if(nums[mid] == target){
                    res = mid;
                }
                start = mid + 1;
            }
        }
        return res;
    }
}
