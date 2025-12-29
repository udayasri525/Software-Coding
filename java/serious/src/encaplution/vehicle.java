package encaplution;

public class vehicle {

    public void run() {
        System.out.println("Vehicle is running");
    }

    public static void main(String[] args) {

        Car car = new Car();   // child object
        car.run();             // parent method
        car.speed();           // child method
    }
}

class Car extends vehicle {

    public void speed() {
        System.out.println("Car is moving at 80 km/h");
    }
}
