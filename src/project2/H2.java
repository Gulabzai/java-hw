package project2;
/*Create an array of integer values. After the array is

        created, calculate the sum of all stored elements in
        that array.

 */

public class H2 {
    public static void main(String[] args) {
        int[] numbers={10,20,30,50,90,45};
        int sum=0;
        for (int number : numbers) {
            sum+=number;

        }
        System.out.println("The sum of all store number is "+sum);


    }
}
