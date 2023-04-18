package project1;

public class H5 {
    public static void main(String[] args) {


        int[][] numbers = {{1, 2, 3,},
                {10, 20, 30},
                {15, 25, 35},
                {40, 43, 60}
        };
        ;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2==0){
                System.out.println(numbers[i][j]+" ");}


            }

        }

    }
}

