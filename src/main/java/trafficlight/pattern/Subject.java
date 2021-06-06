package trafficlight.pattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List <Observer> observer = new ArrayList<>();

    public void addObserver(Observer observer){
        this.observer.add(observer);
    };

    public void removeObserver(Observer observer){
        this.observer.remove(observer);
    };

    public void notifyObserver(){
        for (Observer obs: observer) {
            obs.update();
        }
    };
}