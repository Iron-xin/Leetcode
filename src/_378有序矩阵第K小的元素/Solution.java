package _378有序矩阵第K小的元素;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int row=matrix.length;
        int cow=matrix[0].length;
        if(k==0||row*cow<k){
            return 0;
        }
        //  PriorityQueue<Integer> head=new PriorityQueue<>((O1,O2)->O2-O1);
        PriorityQueue<Integer> head = new PriorityQueue<Integer>(row, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o2-o1;
            }
        });
        for(int i=0;i<row;i++ ){
            for(int j=0;j<cow;j++){
                head.add(matrix[i][j]);
                if(head.size()>k){
                    head.poll();
                }
            }
        }
        return head.peek();
    }
}
