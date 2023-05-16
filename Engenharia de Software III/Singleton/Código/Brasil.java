package singleton;

public class Brasil {
    public static final Brasil INSTACE = new Brasil(214,"miliion");

    private int population;
    private String unit;
    
    private Brasil(int population, String unit){
        this.population = population;
        this.unit = unit;
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
