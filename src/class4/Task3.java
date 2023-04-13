package class4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age");

        int age=scanner.nextInt();
        if (age>=18) {
            System.out.println("you will get driver license");
        }else {
            System.out.println("you will mot get driver license");
        }



    }
}
