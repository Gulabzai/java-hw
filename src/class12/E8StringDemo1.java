package class12;

public class E8StringDemo1 {
    public static void main(String[] args) {
        String sentence="    Java is very very easy";
        sentence=sentence.trim().toLowerCase();
        System.out.println(sentence);


        System.out.println(sentence.startsWith("Java"));
    }
}
