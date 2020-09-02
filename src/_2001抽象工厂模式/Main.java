package _2001抽象工厂模式;

public class Main {
    public static void main(String[] args){
        //拿到能生产工厂的对象
        Produce produce = new Produce();

        AbstractFactory shapeFactory = produce.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("圆");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("三角形");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("正方形");
        shape3.draw();

        AbstractFactory colorFactory = produce.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();
    }
}
