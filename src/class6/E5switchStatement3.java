package class6;

public class E5switchStatement3 {
    public static void main(String[] args) {

        int day=7;


        switch (day){
            case 1:
                System.out.println("monday");//if there is no break it will be lile that
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                    System.out.println("friday");
                    break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
            default:
                System.out.println("wrong day number");
        }
    }
}
