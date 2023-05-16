package facade;
/**
 *
 * @author diego
 */
public class ComponenteFacade implements Component {
    private final Composite composite;

    public ComponenteFacade(String nomeDoComponente) {
        composite = new Composite(nomeDoComponente);
    }

    public void adicionarComponente(Component componente) {
        composite.adicionarComponente(componente);
    }

    public void removerComponente(Component componente) {
        composite.removerComponente(componente);
    }

    public void mostrarDetalhes() {
        composite.mostrarDetalhes();
    }
}

