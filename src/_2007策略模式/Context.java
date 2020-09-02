package _2007策略模式;

public class Context {
    private Strategy strategy;
    //构造函数
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int selcect(int num1, int num2){
        return strategy.operation(num1, num2);
    }
}