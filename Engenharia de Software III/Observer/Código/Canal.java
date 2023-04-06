package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class Canal implements Observable<Video> {
    
    private final String name;
    private final List<Observer<Video>> observers;
    private Video currentVideo;
    
    public Canal(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }
    
    @Override
    public void registrarInscrito(Observer<Video> observer) {
        observers.add(observer);
    }
    
    @Override
    public void removerInscrito(Observer<Video> observer) {
        observers.remove(observer);
    }
    
    @Override
    public void notificarInscritos() {
        for (Observer<Video> observer : observers) {
            observer.update(getState());
        }
    }
    
    @Override
    public Video getState() {
        return currentVideo;
    }
    
    public void postVideo(String title, String description) {
        currentVideo = new Video(title, description);
        notificarInscritos();
    }
    
    public String getName() {
        return name;
    }
    
}
