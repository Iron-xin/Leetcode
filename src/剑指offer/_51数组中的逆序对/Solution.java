package 剑指offer._51数组中的逆序对;

public class Solution {
    public int reversePairs(int[] nums) {
        return merge(nums, 0, nums.length-1);
    }

    public int merge(int[] nums, int start, int end){
        if(start >= end){//分解到不能分解的时候的边界
            return 0;
        }
        int mid = (start + end)/2;// mid为中心左右各一半
        int count = 0;
        count += merge(nums, start, mid);
        count += merge(nums,mid+1, end);
        //上面两行是反复对问题进行分解，直到分解到最小
        //将最小问题合并成次小问题之后的处理，也是最核心的部分
        int[] temp = new int[end-start+1];
//temp数组:构建一个和当前合并的数组大小一样的数组，temp就是将两部分合并并且排序
        int i = start;//合并是左边和右边合并，一个指向左边的元素的指针
        int j = mid+1;//一个指向右边的元素的指针
        int p = 0;//temp中的指针
        while(i <= mid && j <= end){//左边部分的边界mid，右边部分的边界end
//这个while实际就是将两个部分，进行合并的时候排序。
            if(nums[i] <= nums[j]){
                temp[p] = nums[i];
                p++;  //先复制，再++,对我而言可读性更高，逻辑理解更通顺。
                i++;
            }else{//否则，i就比j大，就说明出现了逆序对，因此维护count。
//这里值得说道说道，temp的长度等于左边+右边的长度。既然有了排序的念头，那么合并之前也排好了
//那么左边部分已经有序，右边部分也有序，比如此时进行{1,5,9}和{3,7,8}合并
//则i=1,mid=2,j=3时进入else，可以看到，通过mid-i+1=2，拿到的是{5,3}，{9,3}两组逆序对
//所以count+2,然后j的角标移动，下次比较的是5和7了。这样避免了重复的比较，提高了效率
//这样的操作必须配合排序，如果不排序，就不能这么玩，而不能这么玩的时候，过程如下：
//{1,5,9}和{3,7,8}合并,由于不知道是否有序，5和3形成逆序后，应当count++
//然后移动一次你自己标记的指针。然后你总会通过移动指针比较一次9和3，然后count++。
//而通过排序，这两个count++就变成了一次操作，因此，排序会提升效率，空间复杂度稍微高点。
//因为你用到了额外的数组，合并排序，并且再复制给原数组。
                count = (count+(mid-i+1))%1000000007;
                temp[p] = nums[j];
                p++;
                j++;
            }
        }
//下面的过程也值得一提，当两个序列合并时，左边或者右边先通过指针移动完毕，全复制进temp后，
//就需要将另一边的数据，也全部复制给temp。
//所以下面两个if分别对应左边先复制完了，专门去复制右边，和右边先复制完了，再去复制左边。
        if(i <= mid){
            while(i <= mid){
                temp[p++] = nums[i];
                i++;
            }
        }
        if(j <= end){
            while(j <= end){
                temp[p++] = nums[j];
                j++;
            }
        }
        for(int k = 0;k < end-start+1; k++){//将合并好的数组再复制回nums，以保证有序。
            nums[start+k] = temp[k];
        }
        return count;
    }
}