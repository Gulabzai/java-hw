package class16;

import java.util.Scanner;

public class Person {
    public String name="Valid";
    String SSN="1216588978";

    private String password;
    static double bankBalance=12000;
    private void printPassword(){
        System.out.println(password);
    }
    private static void prntBalance(){
        System.out.println(bankBalance);
    }

    public static void main(String[] args) {
        Person Farwa=new Person();
        Farwa.password="12345";
        Farwa.printPassword();
        System.out.println(Person.bankBalance);
        System.out.println(Farwa.SSN);

    }
}
