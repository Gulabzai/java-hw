package class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("is it time for a break true/false");
        boolean isBreak=scanner.nextBoolean();
        if (isBreak){
            System.out.println("lets have a break");
        }

    }
}
