package class13;
/*
you have a string a= is it saturday? is it raining? do we have a java class today?" how would you find out how
 many sentences are in that string?

 */
public class E7StringDemo {
    public static void main(String[] args) {
        String str="is it saturday? is it raining? do we have a java class today?";
        String []strArr=str.split("[.!?]");
        System.out.println(strArr.length);


    }
}
