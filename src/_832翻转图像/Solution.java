package _832翻转图像;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            //每次都用两个指针对比
            int start = 0;
            int end = A[i].length - 1;
            while (start <= end) {
                // 如果不相等， 那么这两个值不需要更换
                if (A[i][start] != A[i][end]) {
                    start++;
                    end--;
                } else {
                    // //如果相等，那么这两个值同时改变 ，且1变0，0变1
                    if(A[i][start]==1){
                        A[i][end]=0;
                        A[i][start]=0;
                    }
                    else if( A[i][start]==0){
                        A[i][end]=1;
                        A[i][start]=1;
                    }
                    start++;
                    end--;
                }
            }
        }
        return A;
    }
}