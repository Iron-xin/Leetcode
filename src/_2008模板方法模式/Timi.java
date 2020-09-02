package _2008模板方法模式;

public class Timi extends Game {

    @Override
    void endPlay() {
        System.out.println("大吉大利，今晚吃鸡");
    }

    @Override
    void initialize() {
        System.out.println("你已进入一级战备状态，加油特种兵！");
    }

    @Override
    void startPlay() {
        System.out.println("救救我");
    }
}
