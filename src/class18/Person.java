package class18;

public class Person {
    String name;
    void sleep(){
        System.out.println("zzzzzzzzzzzzzzzz");
    }
}
class Employee extends Person{

}
class Tester extends Employee{

}
class PersonTester{
    public static void main(String[] args) {
        Tester tester=new Tester();
        tester.name="Sarah";
        System.out.println("Sarah");
       Employee employee=new Employee();
        employee.sleep();
    }
}
