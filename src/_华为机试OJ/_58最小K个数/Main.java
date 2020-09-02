package _华为机试OJ._58最小K个数;


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] nums = new int[m];
            for(int i=0; i<m; i++){
                nums[i] = sc.nextInt();
            }
            heapSort(nums, n);
            System.out.println();
        }
    }

    private static void heapSort(int[] nums, int key){
        int n = nums.length;
        for(int i=n/2-1; i>=0; i--)
            heapify(nums, i, n);

        for(int i=n-1; i>=n-key; i--){
            if(i != n-key)
                System.out.print(nums[0]+" ");
            else
                System.out.print(nums[0]);
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            heapify(nums, 0, i);
        }
    }

    private static void heapify(int[] nums, int i, int n){
        int smallest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<n && nums[l]<nums[smallest]) smallest = l;
        if(r<n && nums[r]<nums[smallest]) smallest = r;
        if(smallest != i){
            int temp = nums[i];
            nums[i] = nums[smallest];
            nums[smallest] = temp;
            heapify(nums, smallest, n);
        }
    }
}
