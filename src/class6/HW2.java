package class6;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        if (num>=1 && num<=10) {
            System.out.println("the number is small");
        } else if (num>=11 && num<=100) {
            System.out.println("The number is medium");

        } else if (num>=101 && num<=1000) {
            System.out.println("The number is large");

        }

    }
}
