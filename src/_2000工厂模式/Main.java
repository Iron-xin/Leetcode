package _2000工厂模式;

public class Main {
    public static void main(String[] args){
        //
        Factory factory = new Factory();
        Shape  shape1= factory.getShape("圆");
        shape1.draw();
        Shape  shape2= factory.getShape("长方形");
        shape2.draw();
        Shape  shape3= factory.getShape("正方形");
        shape3.draw();
    }
}
