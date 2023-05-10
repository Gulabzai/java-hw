package class14;

public class E6 {
    /*
    create a method which returns true or false and takes an int
    number as parameter if number is even  it returns true otherwise it returns false.
    name of the method is anEven
     */
    boolean anEven(int num) {
        boolean isEven=false;

        if (num % 2 == 0) {

            isEven=true;
    }
        return isEven;
    }

    public static void main(String[] args) {
        E6 obj=new E6();
        System.out.println(obj.anEven(15));
    }
}
