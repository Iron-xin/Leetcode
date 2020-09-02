package _2008模板方法模式;

public class LOL extends Game {

    @Override
    void endPlay() {
        System.out.println("Victory");
    }

    @Override
    void initialize() {
        System.out.println("小兵还有30s到达战场");
    }

    @Override
    void startPlay() {
        System.out.println("First blood");
    }
}
