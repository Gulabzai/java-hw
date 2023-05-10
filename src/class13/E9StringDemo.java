package class13;

public class E9StringDemo {
    public static void main(String[] args) {// String are not changable
        String str="wife";
        str.toLowerCase();
        System.out.println(str);



        StringBuilder str2 =new StringBuilder("Husband");//StringBulder are changebale
        str2.reverse();
        System.out.println(str2);
    }
}
