package class13;

public class E2StringDemo {
    public static void main(String[] args) {
        String str="nhYTUU12!@&%";
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[1-9]","%"));
    }
}
