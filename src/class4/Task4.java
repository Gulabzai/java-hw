package class4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your city");
        String city=scanner.next();

        System.out.println("please enter temperature in fahrenheit");
        float temperature=scanner.nextFloat();
        float convert=(temperature-32)*5/9F;
        System.out.println("The temperature in celsius "+convert);
    }
}
