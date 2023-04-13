package class6;

public class E1LogicalOperators {
    public static void main(String[] args) {

        boolean chocolates=true;
        boolean flower=true;
        if (chocolates ||flower){
            System.out.println("I am happy");

        }else {
            System.out.println("I am sad");
        }

        boolean fiveG=true;
        boolean wifi=false;
        if (wifi ||fiveG){
            System.out.println("you can brows to the internet");

        }else {
            System.out.println("not connected to the internet");
        }
    }
}
