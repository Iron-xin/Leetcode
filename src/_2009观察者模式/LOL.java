package _2009观察者模式;

public class LOL extends Observer{

    public LOL(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "LOL收到了消息并更新版本 "
                + subject.getState() );
    }
}
