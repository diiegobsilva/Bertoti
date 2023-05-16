package singleton;
/**
 *
 * @author diego
 */
public class Main {
        public static void main(String[] args) {
            Brasil brasil = Brasil.INSTACE;
            Brasil brasil2 = Brasil.INSTACE;
            brasil.setPopulation(100);
            System.out.println(brasil + " population: " + brasil.getPopulation() + " " + brasil.getUnit());
            System.out.println(brasil2 + " population: " + brasil.getPopulation() + " " + brasil.getUnit());    
            
            
            System.out.println("------------------------------------------------------------------------");
            
            Argentina argentina = Argentina.getInstance();
            Argentina argentina2 = Argentina.getInstance();
             argentina.setPopulation(500);
            System.out.println(argentina + " population: " + argentina.getPopulation() + " " + argentina.getUnit());
            System.out.println(argentina2 + " population: " + argentina2.getPopulation() + " " + argentina2.getUnit());
    }
}

