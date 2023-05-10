package class17;

public class Dog {
    String name;

    String color;
    String breed;

    int age;

    Dog(String dogName,String dogColor,String dogBreed,int dogAge){
        name=dogName;
        color=dogColor;
        breed=dogBreed;
        age=dogAge;

    }

    void printInfo(){
        System.out.println(name+" "+color+""+breed+" "+age);

    }
    /*create five object of this dog class provide initial values and for each object called the printInfo method

     */
}
