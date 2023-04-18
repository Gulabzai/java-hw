package class10;
//when ever we repeat code we should replace it with a loop
public class E4D2Array {
    public static void main(String[] args) {

        for (int j = 0; j < 3; j++) {

            int[][] matrix = {
                    {10, 20, 30},
                    {20, 50, 65},
                    {102, 54, 60},
            };
            int[] arr1 = matrix[0];                      // just make change in line number 10 we get different iD array
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");

            }
            System.out.println();



        }

    }
}
