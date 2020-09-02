package _2003适配器模式;

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playMp5(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放MP4文件 "+ fileName);
    }
}