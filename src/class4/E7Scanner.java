package class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter yor name");
        String name= scanner.next();

        if (name.equals("Jamil")){
            System.out.println("Mac user");

        } else if (name.equals("KHalid")) {
            System.out.println("Naughty");


        } else if (name.equals("Himat")) {
            System.out.println("Angry");

        } else if (name.equals("Rehan")) {
            System.out.println("Smart");


        }

    }



}
