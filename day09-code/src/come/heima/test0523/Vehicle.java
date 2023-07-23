package come.heima.test0523;

public class Vehicle {
    protected int seat;

    public void move() {
        System.out.println("Vehicle is moving.");
    }
}

class Car extends Vehicle {
    public Car() {
        seat = 4;
    }

    public void move() {
        System.out.println("Car is moving.");
    }
}

class Train extends Vehicle {
    public Train() {
        seat = 100;
    }

    public void move() {
        System.out.println("Train is moving.");
    }
}

class TestVe {
    public static void work(Vehicle v) {
        v.move();
    }

    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Train();

        work(v1);
        work(v2);
    }
}

