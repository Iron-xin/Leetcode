package _2004装饰者模式;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("只能画个圈圈");
    }
}