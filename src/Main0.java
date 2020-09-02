import java.util.Scanner;
//第5题 ac 0.1
public class Main0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
        }
        int ans = solution(arr);

        System.out.println(ans);
    }

    private static int solution(int[] arr) {
        int left = 0;//窗口左边界
        int right = 0;//窗口右边界（当不满足条件后，左边界移动到右边界，并清零temp）
        int temp = 1;
        int count = 1;
        boolean flag = false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                right++;
                temp++;
                count = Math.max(count,temp);
            }else{
                if(arr[i]>arr[i+2] && i<arr.length-2){
                    temp = 1;
                    left = right;
                }else if( flag == false){
                    right++;
                    temp++;
                    count = Math.max(count,temp);
                    flag = true;
                }else{
                    temp = 1;
                    left = right;
                }
            }
        }
        return count;
    }
}
