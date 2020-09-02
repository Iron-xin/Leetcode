package _1013将数组分成和相等的三个部分;

public class Solution2 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i=0;i<A.length;i++) {
            sum += A[i];
        }
        // 数组A的和如果不能被3整除返回false
        if (sum % 3 != 0) {
            return false;
        }
        sum /= 3;

        int left = 0;
        int leftSum = 0;
        int right = A.length - 1;
        int rightSum = 0;

        while(left  <= right){

            if(leftSum != sum){

                leftSum += A[left];
                left++;
            }
            if(rightSum != sum){

                rightSum += A[right];
                right--;
            }
            if((left<=right)&&leftSum == sum && rightSum == sum ){
                return true;
            }

        }
        return false;
    }
}