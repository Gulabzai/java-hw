package class12;

public class CarTester {
    public static void main(String[] args) {
        Car car=new Car();
        car.make="Toyota";
        car.model="Camry";
        car.color="White";
        car.mileage=0;
        car.isAutomatic=true;
        car.StartCar();
        car.turn();
        car.StopCar();
        Car car1=new Car();
        car1.make="testla";
        car1.model="s";
        car1.mileage=15000;
        car1.isAutomatic=true;
        car1.StartCar();
        car1.StopCar();
    }
}
