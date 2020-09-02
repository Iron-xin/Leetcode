package _2009观察者模式;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> list = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        list.add(observer);
    }

    public void notifyAllObservers(){
        for (int i=0;i<list.size();i++) {
            list.get(i).update();
        }
    }
}
