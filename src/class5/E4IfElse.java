package class5;

public class E4IfElse {
    public static void main(String[] args) {

        int money=5000;
        String day="Sunday";
        if (money>30000){

            if (day.equals("Monday")) {
                System.out.println("let,s go shopping");
            }else {
                System.out.println("Let.s wait for Sunday");
            }

        }else {
            System.out.println("lets save more");
        }
    }
}
