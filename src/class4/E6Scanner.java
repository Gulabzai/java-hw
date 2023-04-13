package class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter yor name");
        String name= scanner.next();

        if (name.equals("Jamil")){
            System.out.println("Mac user");
        }else {
            System.out.println("windows user");
        }
    }
}
