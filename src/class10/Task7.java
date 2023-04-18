package class10;
//From an array of integer elements find the largest number
public class Task7 {
    public static void main(String[] args) {
        int[] numbers={10,20,40,50,30};
        /*create a variable to store the largest number assumed number
        to go through all the number from the array one by one
        compare the assumed number the largest number with  all the number in the array
        once we are done looping through all  the numbers print the results

         */
        int largest=numbers[0];
        for (int number : numbers) {
            if (number>largest){
                largest=number;
            }

        }
        System.out.println(largest);
    }
}
