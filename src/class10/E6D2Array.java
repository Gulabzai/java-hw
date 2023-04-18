package class10;

public class E6D2Array {
    public static void main(String[] args) {

        for (int j = 0; j < 5; j++) {

            int[][] matrix = {
                    {10, 20, 30,40,50},
                    {20, 50, 65,20},
                    {102, 54, 60},
                    {20,55}
            };
            int[] arr1 = matrix[j];                      // just make change with j
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");

            }
            System.out.println();



        }

    }
}
