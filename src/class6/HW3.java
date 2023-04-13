package class6;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("What is current time ");
        int hour=scanner.nextInt();
        if (hour>=1 &&hour<=11){
            System.out.println("It is morning time");
        } else if (hour >= 12 && hour <=15) {
            System.out.println("It is Afternoon time");

        } else if (hour>=16 && hour<=20) {
            System.out.println("It is Evening time");

        } else if (hour>=21 && hour<=24) {
            System.out.println("It is Night time");

        }
    }
}
