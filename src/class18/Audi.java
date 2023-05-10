package class18;

public class Audi extends Vehicle {


}
class BMW extends Vehicle{
    void offerMPackage(){
        System.out.println("only BMW offers the Mpackage");
    }
}
class Honda extends Vehicle{

}
class CarTester {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.stopCar();
        BMW bmw=new BMW();
        bmw.stratCar();
    }

}
