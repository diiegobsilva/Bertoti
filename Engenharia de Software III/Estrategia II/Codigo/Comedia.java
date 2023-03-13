package strategy;

public class Comedia extends Thread implements GeneroSerie {
	
	String episodio[] = { "episodio 1", "episodio 2", "episodio 3", "episodio 1", "episodio 4", "episodio 5", "episodio 6" };
	
	public void assistirFilme(); {
		Thread threadComedia = new Thread(this);
		threadComedia.start();
        for (int i = 0; i < episodio.length; i++) {
            System.out.println(episodio[i] + " esta Assistindo!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("O episodio acabou!");
	}
}


