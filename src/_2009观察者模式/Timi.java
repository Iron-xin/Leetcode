package _2009观察者模式;

public class Timi extends Observer {
    public Timi(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Timi收到了消息并更新了版本 "
                + 3+subject.getState() );
    }
}
