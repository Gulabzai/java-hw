package class12;
// how many time R appears?
public class E11StringDemo2 {
    public static void main(String[] args) {
        String name="Zackbacha";
       // System.out.println(name.charAt(2));
        int counter=0;
        for (int i = 0; i <name.length() ; i++) {
            if (name.charAt(i)=='R'){
                counter++;
            }


        }
        System.out.println(name.charAt(counter));
    }
}
