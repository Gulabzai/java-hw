package class6;

public class E6SwitchStatement {
    public static void main(String[] args) {

        char gender='F';
        switch (gender){
            case 'F':
                System.out.println("female");
                break;
            case 'M':
                System.out.println("male");
                break;
            case 'O':
                System.out.println("Others");
                break;
            default:
                System.out.println("chart will not support");

        }
    }
}
