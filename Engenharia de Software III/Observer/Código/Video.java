package observer;
/**
 *
 * @author diego
 */
public class Video {
    private final String titulo;
    private final String descricao;
    
    public Video(String title, String descricao) {
        this.titulo = title;
        this.descricao = descricao;
    }
    
    public String getTitle() {
        return titulo;
    }
    
    public String getDescription() {
        return descricao;
    }
}
