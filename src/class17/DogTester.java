package class17;

public class DogTester {
    public static void main(String[] args) {
       // code will creat the object of the dog class
       // Dog("Jack","Black","Persion",12);
        //new dog()
        Dog dog=new Dog("Jack","Black","Persion",12);
        Dog dog1=new Dog("shaggy","white","Huskey",8);
        Dog dog2=new Dog("Fluffy","Gray","Broitish",7);
        Dog dog3=new Dog("Papi","Brown","Asian",6);
        Dog dog4=new Dog("papi2","Brown Black Mix","Asian",6);
        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();
        dog.printInfo();
    }
}
