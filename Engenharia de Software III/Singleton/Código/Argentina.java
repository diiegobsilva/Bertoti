package singleton;
/**
 *
 * @author diego
 */
public class Argentina {
    public static final Argentina INSTACE = new Argentina(45,"miliion");

    private int population;
    private String unit;
    
    private Argentina(int population, String unit){
        this.population = population;
        this.unit = unit;
    }
    
    public static Argentina getInstance(){
        return INSTACE;
    }
    
    public int getPopulation() {
        return population;
    }
    
    public void setPopulation(int population) {
        this.population = population;
    }

    public String getUnit() {
        return unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }
}
