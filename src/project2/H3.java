package project2;
/*Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.


 */
public class H3 {
    public static void main(String[] args) {
        int [][] numbers={{2,5,6,9},
                {4,6,8,5},
                {3,7,1,5},
                {4,8,2,3}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if (numbers[i][j]%2==0){
                    System.out.println(numbers[i][j]+" ");
                }



            }


        }

    }
}
