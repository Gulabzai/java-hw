package class6;

public class E5switchStatement2 {
    public static void main(String[] args) {

        int day=1;

        switch (day){
            case 1:
                System.out.println("monday");//if there is no break it will be lile that

            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            default:
                System.out.println("wrong day number");
        }
    }
}
