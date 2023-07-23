package come.heima.test0606;

public class TestElec {
    public static void main(String[] args) {
        ElecEquipment el1 = new AirConditioner("AirCon", "ABC123");
        el1.work();
        AirConditioner ac1 = (AirConditioner) el1;
        ac1.turnOn();
        ac1.printInfo();

        calculator();
    }

    public static void calculator() {
        int result = 1;
        for (int i = 1; i <= 10; i++) {
            result *= i;
        }
        System.out.println("10! = " + result);
    }
}