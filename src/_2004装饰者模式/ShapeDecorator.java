package _2004装饰者模式;

public abstract class ShapeDecorator implements Shape {
    public Shape decoratedShape;

    //构造函数，给Shape属性赋值
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}