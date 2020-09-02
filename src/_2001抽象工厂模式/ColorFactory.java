package _2001抽象工厂模式;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equals("RED")) {
            return new Red();
        } else if (color.equals("GREEN")) {
            return new Green();
        } else if (color.equals("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
