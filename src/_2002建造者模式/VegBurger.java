package _2002建造者模式;

public class VegBurger extends Burger {

    @Override
    public int price() {
        return 25;
    }

    @Override
    public String name() {
        return "蔬菜憨包包";
    }
}