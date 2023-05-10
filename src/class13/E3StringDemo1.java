package class13;

public class E3StringDemo1 {
    public static void main(String[] args) {
        String str="ksgsgfnAHY6W       JNBD1254868@#&*$";
        System.out.println(str.replaceAll("[a-z]",""));// it well deleted lower case
        System.out.println(str.replaceAll("[^a-z]",""));// ^ it mean !
      //  don,t replace lowercase a-z and from 1-9
    System.out.println(str.replaceAll("[^a-z0-9]",""));// ^ it mean !
    System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));// ^ it mean !
    System.out.println(str.replaceAll("[Dn3]",""));
    System.out.println(str.replaceAll("[A-Z]","\\$"));
    System.out.println(str.replaceAll(" ","\\$"));

    }
}
