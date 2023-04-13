package class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {

        /*create a boolean variable summer store true in then write a loop*/

        boolean summer=true;
        int temp=85;
        while (summer){
            if (temp<100){
                System.out.println("its good i enjoy summer");
            }else {
                System.out.println("its very hot");
                break;
            }
            temp=temp+3;

        }
    }
}
