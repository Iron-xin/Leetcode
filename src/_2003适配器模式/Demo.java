package _2003适配器模式;

public class Demo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "音乐.mp3");
        audioPlayer.play("mp4", "视频.mp4");
        audioPlayer.play("mp5", "进阶视频.mp5");
        audioPlayer.play("avi", "开车.avi");
    }
}