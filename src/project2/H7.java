package project2;
/*. Write a Java Program to print the first 10 numbers of
        Fibonacci series.

 */
public class H7 {
    public static void main(String[] args) {
        int num=10;
        int firstNum=0;
        int secondNum=1;
        System.out.println("Fibonacci series for first "+num+" number:");
        for (int i = 0; i < num; i++) {
            System.out.println(firstNum+" ");
            int sum=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=sum;

        }
    }
}
