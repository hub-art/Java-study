package come.heima.test0606;

public class AirConditioner extends ElecEquipment implements InterStandard {
    private String model;

    public AirConditioner(String name, String model) {
        super(name);
        this.model = model;
    }

    @Override
    public void work() {
        System.out.println(name + " is working.");
    }

    public void turnOn() {
        System.out.println(name + " is turned on.");
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Model: " + model);
    }
}
