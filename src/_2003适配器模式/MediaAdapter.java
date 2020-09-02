package _2003适配器模式;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedPlayer;
    //构造器
    public MediaAdapter(String audioType){
        if(audioType.equals("mp5") ){
            advancedPlayer = new Mp5Player();
        } else if (audioType.equals("mp4")){
            advancedPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp5")){
            advancedPlayer.playMp5(fileName);
        }else if(audioType.equals("mp4")){
            advancedPlayer.playMp4(fileName);
        }
    }
}