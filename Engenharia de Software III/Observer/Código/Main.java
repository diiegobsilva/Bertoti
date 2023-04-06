package observer;
/**
 *
 * @author diego
 */
public class Main {

    public static void main(String[] args) {
            Canal CanalDoDiego = new Canal("Canal do Diego");
        Inscrito inscrito1 = new Inscrito("Ana");
        Inscrito inscrito2 = new Inscrito("Danilo");
        Inscrito inscrito3 = new Inscrito("Mateus");
        Inscrito inscrito4 = new Inscrito("Agenor");
        
        CanalDoDiego.registrarInscrito(inscrito1);
        CanalDoDiego.registrarInscrito(inscrito2);
        CanalDoDiego.registrarInscrito(inscrito3);
        CanalDoDiego.registrarInscrito(inscrito4);
        
        CanalDoDiego.postVideo("Como jogar CS", "Nesse vídeo vc vai aprender a como jogar Cs de vez");
    }

}
