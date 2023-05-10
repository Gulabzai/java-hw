package class17;

public class Dog1 {
    String name;

    String color;
    String breed;

    int age;

    Dog1(String dogName, String dogColor, String dogBreed, int dogAge){
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
