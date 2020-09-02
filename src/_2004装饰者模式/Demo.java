package _2004装饰者模式;

public class Demo {
    public static void main(String[] args) {

        Shape circle = new Circle();
//        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
//        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("看我接下来画什么：");
        circle.draw();
        System.out.println();

        System.out.println("功能提升：");
        redCircle.draw();
        System.out.println();

        System.out.println("功能提升：");
        redRectangle.draw();
    }
}