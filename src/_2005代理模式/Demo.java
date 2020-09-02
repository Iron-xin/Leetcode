package _2005代理模式;
public class Demo {

    public static void main(String[] args) {
        Image image = new ProxyImage("火车票.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
