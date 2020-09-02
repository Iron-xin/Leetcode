package _2001抽象工厂模式;

public class Produce {
    public static AbstractFactory getFactory(String choice){
        if(choice.equals("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equals("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
