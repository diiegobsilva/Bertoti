
package composite;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author diego
 */
class Composite implements Component {
    private String nomeDoComponente;
    private List<Component> components = new ArrayList<>();

    public Composite(String nomeDoComponente) {
        this.nomeDoComponente = nomeDoComponente;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println(nomeDoComponente);
        for (Component component : components) {
            component.mostrarDetalhes();
        }
    }

    public void adicionarComponente(Component component) {
        components.add(component);
    }

    public void removerComponente(Component component) {
        components.remove(component);
    }
}
