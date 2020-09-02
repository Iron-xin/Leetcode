package _华为机试OJ._90合法IP;


import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            String str=sc.next();
            String [] array=str.split("\\.");
            int count=0;
            for(int i=0;i<array.length;i++)
            {
                int p=Integer.parseInt(array[i]);
                if(p>=0&&p<=255)
                {
                    count+=1;
                }
            }
            if(count==4)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}