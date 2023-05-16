package facade;
/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        ComponenteFacade escritorio = new ComponenteFacade("Escritório");

        ComponenteFacade pc = new ComponenteFacade("Computador");
        ComponenteFacade mouse = new ComponenteFacade("Mouse");
        ComponenteFacade mousePad = new ComponenteFacade("Mouse pad");
        ComponenteFacade headset = new ComponenteFacade("Headset");

        pc.adicionarComponente(mouse);
        pc.adicionarComponente(mousePad);
        pc.adicionarComponente(headset);

        escritorio.adicionarComponente(pc);

        escritorio.mostrarDetalhes();
        
        // Remover o componente "Mouse" do PC
        pc.removerComponente(mouse);

        escritorio.mostrarDetalhes();
    }
}
