package observer;
/**
 *
 * @author diego
 */
public class Inscrito implements Observer<Video>{
    
    private final String name;
    
    public Inscrito(String name) {
        this.name = name;
    }
    
    @Override
    public void update(Video state) {
        System.out.println(name + " Notificação Recebida: " + state.getTitle() + "  //  " + state.getDescription());
    }
}
