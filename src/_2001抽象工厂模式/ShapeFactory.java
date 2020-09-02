package _2001抽象工厂模式;


public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if(shape.equals("圆")){
            return new Circle();
        } else if(shape.equals("三角形")){
            return new Rectangle();
        } else if(shape.equals("正方形")){
            return new Square();
        }
        return null;
    }
}