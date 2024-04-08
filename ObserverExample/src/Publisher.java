import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject{

    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notify(String message) {
        for(Observer observer:subscribers){
            observer.update(message);
        }
    }
}
