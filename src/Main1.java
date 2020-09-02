import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1 {


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
            String [] s=sc.next().split(" ");
            int sum=0;
            for(int i=0;i<s.length;i++){
                sum=sum+Integer.parseInt(s[i]);
            }
            System.out.println(sum);
        }
    }
}