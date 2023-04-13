package Class9;

public class E11Arrays {
    public static void main(String[] args) {
        //print all  number from 6to 0 in reverse order
        //{'A','B','C','D','E','F'}
        //6 5 4 3 2 1
        char[] chars={'A','B','C','D','E','F'};
        for (int i = 5; i >=0 ; i--) {  //chars.length-1 replace 5
            System.out.println(i+" "+chars[i]);

        }
    }
}
