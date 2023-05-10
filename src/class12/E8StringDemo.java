package class12;

public class E8StringDemo {
    public static void main(String[] args) {
        String sentence="Java is very very easy";
        sentence=sentence.trim().toLowerCase();
        String searchWord="Java";
        System.out.println(sentence.startsWith("Python"));
        System.out.println(sentence.startsWith("Java"));
    }
}
