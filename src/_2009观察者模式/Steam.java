package _2009观察者模式;

public class Steam extends Observer{

    public Steam(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Steam收到了通知并更新了版本 "
                + (subject.getState()+3) );
    }
}
