package class10;
/* create an array on integers and calculate the sum of the all elements in an array.

from an array of integer elements find the largest number
 */
public class Task6 {
    public static void main(String[] args) {
        int[] numbers={20,30,40,50};
        int sum=0;// it is for initialize the sum
        for (int number : numbers) {
            sum=sum+number;

        }
        System.out.println(sum);
    }
}
