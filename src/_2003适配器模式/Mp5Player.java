package _2003适配器模式;

public class Mp5Player implements AdvancedMediaPlayer{
    @Override
    public void playMp5(String fileName) {
        System.out.println("播放Mp5文件： "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}