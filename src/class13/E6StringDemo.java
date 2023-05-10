package class13;
// seond q
public class E6StringDemo {
    public static void main(String[] args) {
        String str = "adrtdcgSETGHFT12355@#$%&*";
        String str1=str.replaceAll("[^a-zA-Z]","");
        System.out.println(str1);
        System.out.println(str1.length());
    }
}
