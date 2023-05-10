package class12;

public class E4SteingDemo1 {
    public static void main(String[] args) {
        String firstName="Ana";
        String lastName=null;

        String fullName=firstName+lastName;// this one used approach
        System.out.println(fullName);
        System.out.println(firstName.concat(lastName));

    }
}
