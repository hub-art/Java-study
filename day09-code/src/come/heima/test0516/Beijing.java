package come.heima.test0516;

public class Beijing extends City {
    public Beijing(String location, int population) {
        super("Beijing", location, population);
    }

    @Override
    public void buildSubway() {
        System.out.println("Building subway in " + name + " with advanced technology");
    }

    public void call() {
        super.buildSubway();
        System.out.println("Subclass name: " + name);
        System.out.println("Superclass name: " + super.name);
    }
}
