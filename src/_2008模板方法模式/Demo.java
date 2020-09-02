package _2008模板方法模式;

public class Demo {

    public static void main(String[] args) {

        Game game = new LOL();
        game.play();
        System.out.println();
        game = new Timi();
        game.play();
    }
}