package _2007策略模式;

public class Subtract implements Strategy{
    @Override
    public int operation(int num1, int num2) {
        return num1 - num2;
    }
}
