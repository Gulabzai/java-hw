package class7;

public class E12Loops {
    public static void main(String[] args) {
        int num=100;

        while (num>0){
            System.out.print(num+" ");
            num--;
        }
        int num2=20;
        System.out.println();
        while (num2<=100){
            System.out.print(num2+" ");
            num2+=2;
        }
        int num3=100;
        System.out.println();
        while (num3>=1){
            if (num3%2==1){
                System.out.print(num3+" ");
            }
            num3--;
        }

    }
}
