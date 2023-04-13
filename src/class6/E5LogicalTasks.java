package class6;

import java.util.Scanner;

public class E5LogicalTasks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your height inch");
        int height=scanner.nextInt();


        if (height<60){
            System.out.println("you r short");
        } else if(height>=62&&height<=72){
            System.out.println("u r medium");

        } else if (height>=72){
            System.out.println("u r tall");

        }

        }
    }
