package class17;
/*write a java class will have a contructor one with parameters and second without any parameters .
        Create a separate Test class where you will execute both of the constructor 1 by 1*/
public class person {
    String name;

    person(){
        System.out.println("no argument Construcor");

    }
    person(String personName){
        name=personName;
        System.out.println("1 argument Construcor");

    }

}
