package _2004装饰者模式;

public class RedShapeDecorator extends ShapeDecorator {

    //构造函数
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
    //扩展的新功能
    private void setRedBorder(Shape decoratedShape){
        System.out.println("现在可以染红："+decoratedShape);
    }
}