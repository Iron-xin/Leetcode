package _2007策略模式;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new Add());
        System.out.println("10 + 5 = " + context.selcect(10, 5));

        context = new Context(new Subtract());
        System.out.println("10 - 5 = " + context.selcect(10, 5));

        context = new Context(new Multiply());
        System.out.println("10 * 5 = " + context.selcect(10, 5));
    }
}
