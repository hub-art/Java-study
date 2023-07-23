package come.heima.test0516;

public class TestCity {
    public static void main(String[] args) {
        City city = new City("New York", "USA", 8538000);
        city.buildSubway();
        System.out.println("城市名: " + city.name);
        System.out.println("地点: " + city.location);
        System.out.println("人口: " + city.population);

        Beijing beijing = new Beijing("China", 21540000);
        beijing.buildSubway();
        System.out.println("城市名: " + beijing.name);
        System.out.println("地点: " + beijing.location);
        System.out.println("人口: " + beijing.population);
        beijing.call();
    }
}

