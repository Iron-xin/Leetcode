package _153寻找排序数组旋转后的最小值;

public class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            //
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                //中间的比右边的小，则一定在左边
                //这种情况是分成两个部分，实际上，是[left,mid) 和[mid,right) 只是用了right去比较而已。
                //因此，出现mid<right的情况时，必然缩减范围，当mid=right时，显然还是在左边，因此
                //也是缩减范围，这个写法只有Mid大于了right，才说明在右边区域
                right = mid;
            }
        }
        return nums[left];//这里Left和right都可以
    }
    //一般建议用上面的边界写法
    //下面是分3段的  由于是从右往左边逼近，且右边可取，因此需要返回right。上面的会使得left=right为结束，因此左右都可以返回
    public int findMin2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= nums[right]) {
                left = mid + 1;
            } else {
                //这里是[left,mid] [mid] [mid,right] 显然mid比right小，说明在左边，缩减
                //当mid大于right，肯定说明在右边，那么当mid=right时，由于本题是升序且无重复，因此mid=right就说明到头了，
                //其实直接返回。 所以下面的写法3 是可以成功运行的
                right = mid;
            }
        }
        return nums[right];
    }
    public int findMin3(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]){
                //这里的mid=right，和大于一样，都说明在右边区域
                right = mid;
            } else
                return nums[right];

        }
        return nums[right];
    }
}
