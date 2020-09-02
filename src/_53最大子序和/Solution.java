package _53最大子序和;

public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length <1)
            return 0;
        int leftindex = nums[0];//左边界
        int sum = nums[0];//全局变量 总和
        int temp =0;//某个子序列的和

        for(int i = 0; i<nums.length; i++){
            if(temp<0 ){
                leftindex = nums[i];//如果当前的子序列和小于0，则说明当前子序列没有贡献，因为要求和，为正数。
                //所以更新窗口的左边界，由于索引i位置的并没有加入到temp中，所以左边界赋值的是i位置的元素
                temp = nums[i];//同时也要更新子序列的和，因为窗口变新的了。
            } else{//那如果已经大于0，那么就加上i位置的元素，再下一次添加元素的时候比较
                //我尝试了半天的当时比较，没做出来，看大佬的都是下一次比较。
                temp = temp +nums[i];
            }
            if(sum<temp)//相比取最大值
                sum = temp;
        }
        return sum;
    }
}
//这个写法和我刚开始想的比较符合，先求和，再比较，只是没有更新左窗口
//事实上，我吧leftindexd的两行代码去掉，也是正确的，可以跑起来。也就是说，这两个写法是一样的，只是逻辑有点不同
////class Solution {
//    public int maxSubArray(int[] nums) {
//        int Maxsum=nums[0],sum=0;
//        for (int i = 0; i < nums.length; i++) {
//            sum+=nums[i];
//            if(sum>Maxsum){
//                Maxsum=sum;
//            }
//            if(sum<0)
//            {
//                sum=0;
//            }
//        }
//        return Maxsum;
//    }
//}