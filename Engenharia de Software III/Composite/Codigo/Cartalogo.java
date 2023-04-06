package composite;

/**
 *
 * @author diego
 */
class Cartalogo implements Component {
    private String nomeDoComponente;
    private int preco;

    public static final String PRECO_PREFIXO = "Preço: $";

    public Cartalogo(String nomeDoComponente, int preco) {
        this.nomeDoComponente = nomeDoComponente;
        this.preco = preco;
    }

    public void mostrarDetalhes() {
        System.out.println(nomeDoComponente + " / " + PRECO_PREFIXO + preco);
    }
}
