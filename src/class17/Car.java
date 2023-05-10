package class17;

public class Car {
    String make;
    String model;
    int engineCC;
    String color;
    Car(String make,String model,int engineCC,String color){
       this.make=make;
        this.model=model;
        this.engineCC=engineCC;
        this.color=color;
    }
   /* Car(String carmake,String carmodel,int carengineCC,String carcolor){
        make=carmake;
        model=carmodel;
        engineCC=carengineCC;
        color=carcolor;*/
   // }
    void printInfo(){
        System.out.println(make+" "+model+" "+engineCC+" "+color);
    }

    public static void main(String[] args) {
        Car car=new Car("honda","civic type",1800,"white");
        car.printInfo();
    }

}
