package project2;
/*Write a java program to find the second largest
        number in the array

 */
public class H9 {
    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 9, 8, 4, 7};
        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("The second largest number in the array is: " + secondLargest);
    }



}
