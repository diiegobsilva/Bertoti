package strategy;

public class PlataformaFilme {
    private GeneroSerie generoSerie;
   	public void setGenero (GeneroSerie serie) {
		generoSerie = serie;
	}
	
	public void escolherFilme() {
		generoSerie.assistirSerie();
	}
}

