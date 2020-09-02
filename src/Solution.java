import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;


public class Solution {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1==s2);

        String s3 = new String("xyz");
        String s4 = new String("xyz");
        System.out.println(s3==s4);
        System.out.println("****");
        test5();
        HashMap<Integer,Integer> map = new HashMap<>();
        ConcurrentHashMap<Integer,Integer> map1 = new ConcurrentHashMap<>();
//        Hashtable
    }
    public static void test(){
        String s1 = new String("go") +new String("od");
        String s2 = s1.intern();
        String s3 = "good";
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);
        System.out.println("****");
//        String s4 = new String("ja") + new String("va");
        String s7 = new String("java");
        String s5 =  s7.intern();
        String s6 = "java";
        System.out.println(s7 == s5);
        System.out.println(s5 == s6);
        System.out.println(s5 == s7);
        System.out.println("****");
        String m = "hello,world";
        String n = "hello,world";
        String u = new String(m);
        String v = new String("hello,world");
        System.out.println(m == u);
        System.out.println(u == v);


    }
    public static void test2(){
        String s1 = "Hello";
        String s2 = new StringBuffer("He").append("llo").toString();
        String s3 = s2.intern();
        // Determine which strings are equivalent using the ==
        // operator
        System.out.println("s1 == s2? " + (s1 == s2));
        System.out.println("s1 == s3? " + (s1 == s3));
        System.out.println();
    }
    public static void test3(){
        String s2 = new StringBuffer("He").append("llo").toString();
        String s1 = "Hello";

        String s3 = s2.intern();
        // Determine which strings are equivalent using the ==
        // operator
        System.out.println("s1 == s2? " + (s1 == s2));
        System.out.println("s1 == s3? " + (s1 == s3));
        System.out.println();
    }
    public static void test4(){
//        String str1 = "HelloFlyapi";
//        String str6 = "Hello" + "Flyapi";
//
//        System.out.println(str1 == str6); // true
//        //
        String str1 = "HelloFlyapi";
        String str2 = "Hello";
        String str3 = "Flyapi";
        String str4 = str2 + str3;

        System.out.println(str1 == str4); // false
    }
    public static void test5() {
        String s1 = "good";
        String s2 = new String("go")+new String("od");
        String s3 = s2.intern();

        System.out.println("s1 == s2? " + (s1 == s2));
        System.out.println("s1 == s3? " + (s1 == s3));

        String s4=new String("str") + new String("01");//生成了3个对象，常量池中对象"str"和"01"，堆中的字符串对象"str01"
        System.out.println(s4.intern() == s4);//注意s1.intern()，"str01"在常量池中不存在, 所以会返回s1的引用；这里返回true，注意与上面的区别

        String s5 = new String("str01");//这种方式创建String，并不会去常量池创建s1中的"str01"对象，而是仅在堆里创建一个s2对象
        System.out.println(s5.intern() == s5); //s2.intern()发现没常量池中没有"str01"对象, 将堆中s2的引用返回；结果为true
    }
}
