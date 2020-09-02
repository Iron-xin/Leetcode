package _48旋转头像;

public class Solution {
    public void rotate(int[][] matrix) {
        int temp=-1;
        //由于是n*n，所以只用一个matrix[0].length-1表示即可，这个是表示列
        //行的长度就是matrix.length
        for(int start=0,end=matrix[0].length-1;start<end;start++,end--){
            for(int s=start,e=end;s<end;s++,e--){//内能for循环一次，旋转一圈。
                temp=matrix[start][s];
                matrix[start][s]=matrix[e][start];
                matrix[e][start]=matrix[end][e];
                matrix[end][e]=matrix[s][end];
                matrix[s][end]=temp;
            };
        };
    }
    public class Solution2 {
        public void rotate(int[][] matrix) {
            int abs1 = 0;
            int abs2 = matrix.length - 1;
            int times = 0;
            while (abs1 <= abs2) {
                int p1 = abs1;
                int p2 = abs2;
                while (p1 != abs2) {
                    int temp = matrix[abs1][p1];        //左上
                    matrix[abs1][p1] = matrix[p2][abs1];//左上 = 左下
                    matrix[p2][abs1] = matrix[abs2][p2];//左下 = 右下
                    matrix[abs2][p2] = matrix[p1][abs2];//右下 = 右上
                    matrix[p1][abs2] = temp;            //右上 = 左上
                    p1 += 1;
                    p2 -= 1;
                }
                abs1 += 1;
                abs2 -= 1;
            }
        }
    }
}
