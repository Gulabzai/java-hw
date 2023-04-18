package project1;

public class H4 {
    public static void main(String[] args) {


        int [][] numbers={{1,2,3,},
                {10,20,30},
                {15,25,35}
        };
        int sum=0;
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                sum+=numbers[i][j];


            }

        }
        System.out.print("Sum of all number is "+sum);
    }
}
