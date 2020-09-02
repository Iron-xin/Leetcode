import java.util.Scanner;
//第2题 ac 0.2

//a b a+b
public class Main {
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
    public static int solution(int[] arr){
        int count=0;
        for(int i = 1;i<arr.length-1;i++){
            if(i*2+1<arr.length)
               // arr[i]+arr[i+1]<arr[arr.length-1];
                count += 2*i-i-1;
             if(i*2+1>=arr.length)
                count +=arr.length-i-1;
        }
        return count;
    }
}
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ans = 0;
//        ans = solution(n);
//
//        System.out.println(ans);
//    }
//    public static int solution(int n){
//        int count=0;
//        for(int i = 1;i<n-1;i++){
//            if(i*2+1<n)
//                count += 2*i-i-1;
//            else if(i*2+1>=n)
//                count +=n-i-1;
//        }
//        return count;
//    }
//}