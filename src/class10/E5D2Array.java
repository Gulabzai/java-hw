package class10;
//when ever we repeat code we should replace it with a loop
public class E5D2Array {
    public static void main(String[] args) {

        for (int j = 0; j < 3; j++) {

            int[][] matrix = {
                    {10, 20, 30},
                    {20, 50, 65},
                    {102, 54, 60},
            };
            int[] arr1 = matrix[j];                      // just make change with j
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");

            }
            System.out.println();



        }

    }
}
