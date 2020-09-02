package _华为机试OJ._49多线程打印;


import java.util.Scanner;

public class Main implements Runnable {

    private String name;
    private Object prev;
    private Object self;
    private int count;
    private Main(String name, Object prev, Object self, int count) {
        this.name = name;
        this.prev = prev;
        this.self = self;
        this.count = count;
    }
    @Override
    public void run() {
        // int count = 10;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(name);
                    count--;
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int count = sc.nextInt();
            help(count);

        }
    }
    public  static void help(int count){
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        Object d = new Object();

        Main pa = new Main("A", d, a, count);
        Main pb = new Main("B", a, b, count);
        Main pc = new Main("C", b, c, count);
        Main pd = new Main("D", c, d, count);

        new Thread(pa).start();
        try {
            Thread.sleep(100); // 确保按顺序A、B、C执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(pb).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(pc).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(pd).start();
    }
}