package come.heima.test0516;

public class City {
    protected String name;
    protected String location;
    protected int population;

    public City(String name, String location, int population) {
        this.name = name;
        this.location = location;
        this.population = population;
    }

    public void buildSubway() {
        System.out.println("Building subway in " + name);
    }
}

