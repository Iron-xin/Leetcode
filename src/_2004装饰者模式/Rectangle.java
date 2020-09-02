package _2004装饰者模式;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("只能画个框框");
    }
}
