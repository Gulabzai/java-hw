package class13;

public class E4StringDemo {
    public static void main(String[] args) {
        String str="TodaY IS Sunday. we have Java class. we like Java";
        String[]strArr=str.split("[.]");
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
    }
}
