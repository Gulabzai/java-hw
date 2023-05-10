package class12;

public class E6StringDemo {
    public static void main(String[] args) {

        String name="Jamil";
        System.out.println(name.equals("Ahmad"));
        System.out.println(name.equals("Jamil"));
        System.out.println(name.equalsIgnoreCase("JAMIL"));
        System.out.println(!name.equalsIgnoreCase("JAMIL"));

    }
}
