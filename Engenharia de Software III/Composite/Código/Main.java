package composite;
/**
 *
 * @author diego
 */
public class Main {
        public static void main(String[] args) {
        // Criando alguns objetos Leaf
        Component mouse = new Cartalogo("Mouse", 110);
        Component mousePad = new Cartalogo("Mouse pad", 90);
        Component headset = new Cartalogo("Headset", 400);

        // Criando um objeto Composite e adicionando os objetos Leaf a ele
        Composite pc = new Composite("Computador");
        pc.adicionarComponente(mouse);
        pc.adicionarComponente(mousePad);
        pc.adicionarComponente(headset);

        // Criando outro objeto Composite e adicionando o objeto anterior a ele
        Composite escritorio = new Composite("Escritório");
        escritorio.adicionarComponente(pc);

        // Mostrando os detalhes dos objetos
        escritorio.mostrarDetalhes();
    }
}
