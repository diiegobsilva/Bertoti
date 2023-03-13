package strategy;

public class Main {

	public static void main(String[] args) {
		PlataformaFilme filme = new PlataformaFilme();
		filme.setGenero(new Comedia());
		filme.escolherFilme();
	}	
}
