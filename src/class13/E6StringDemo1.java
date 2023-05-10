package class13;
// seond q
public class E6StringDemo1 {
    public static void main(String[] args) {
        String str = "adrtdcgSETGHFT12355@#$%&*";
        System.out.println(str.replaceAll("[^a-zA-Z]","").length());

    }
}
