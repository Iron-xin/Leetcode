package 剑指offer._66构建乘积数组;

public class Solution {
    public int[] constructArr(int[] a) {
        if(a==null || a.length<2)
            return new int[0];
        int[] B=new int[a.length];
        B[0]=1;
        //这一轮循环下来，B数组中暂时存放了自己对应左下三角的乘积
        //即自己分成了左右两部分相乘后，左边部分的值此时拿到了
        for(int i=1;i<a.length;i++)
            B[i]=B[i-1]*a[i-1];
        int temp=1;
        for(int i=a.length-2;i>=0;i--){
            temp*=a[i+1];
            //temp =temp*A[i+1]; temp就是i位置对应的右边部分的值 从A[n-1]一直乘到A[1]
            B[i]*=temp;
            //B[i] =B[i]*temp; 左边部分乘上右边部分
        }
        return B;
    }
}
