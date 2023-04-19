package project2;
 /*Create a 2D array of integers. Develop a program
         which will calculate the sum of even and odd numbers
         for that array.

  */
public class H4 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int evenSum = 0;
        int oddSum = 0;
        for (int[] row : numbers) {
            for (int num : row) {
                if (num % 2 == 0) {
                    evenSum += num;
                } else {
                    oddSum += num;}

                }

            }
            System.out.println("Sum of even numbers: " + evenSum);
            System.out.println("Sum of odd numbers: " + oddSum);

        }
    }