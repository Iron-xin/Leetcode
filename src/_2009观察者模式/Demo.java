package _2009观察者模式;

public class Demo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new LOL(subject);
        new Timi(subject);
        new Steam(subject);

        System.out.println("发送第一个消息");
        subject.setState(4);
        System.out.println("发送第二个消息");
        subject.setState(5);
    }
}
