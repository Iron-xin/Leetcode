package _2000工厂模式;

public class Factory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shape){
        if(shape == null){
            return null;
        }
        if(shape.equals("圆")){
            return new Circle();
        } else if(shape.equals("长方形")){
            return new Rectangle();
        } else if(shape.equals("正方形")){
            return new Square();
        }
        return null;
    }
}