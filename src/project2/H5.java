package project2;
/*5. Write a program to swap 2 numbers without a
temporary variable?

 */

public class H5 {
    public static void main(String[] args) {
        //before swapping.
        int a=10;
        int b=20;
        System.out.println("Before swapping, a= "+a+" & b= "+b);
        //Swap the number
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping, a= "+a+" & b= "+b);
    }
}
