public class Main {

    public static void main(String[] args) {
        
        GasPoweredCar gas = new GasPoweredCar("Gas Car", 14, 6);
        runCar(gas);
    }

    public static void runCar(Car car) {

        car.startEngine();
        car.drive();
    }
}