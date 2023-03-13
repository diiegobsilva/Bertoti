package strategy;

public class PlataformaFilme {
    private GeneroFilme generoFilme;
   	public void setGenero (GeneroFilme filme) {
		generoFilme = filme;
	}
	
	public void escolherMusica() {
		generoFilme.assistirFilme();
	}
}
