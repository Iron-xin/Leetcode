package _1460通过反转子数组使两个数组相等;

public class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] bucket = new int[1001];//因为数据量就是这么大
        for (int i=0;i<target.length;i++)
            bucket[target[i]]++;

        for (int i=0;i<arr.length;i++) {
            bucket[target[i]]--;
        }
        for(int j=0;j<bucket.length;j++){
            if(bucket[j]!=0)
                return false;
        }

        return true;
    }
}
