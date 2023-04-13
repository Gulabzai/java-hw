package class6;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your birth month");
        String month=scanner.next();
        if (month.equals("March")||month.equals("April") ||month.equals("May")){
            System.out.println("you were burn in Spring season");
        } else if (month.equals("June") ||month.equals("July") ||month.equals("August")) {
            System.out.println("you were burn in summer season");

        }
    }
}
