package project1;

public class H2 {
    public static void main(String[] args) {
        String[][] cars={{"Ford","Chevrolet","Dodge","Tesla"},
                {"Mercedes","BMW","Audi","Porsche"},
                {"Hyundai","Kia","Genesis","SsangYoung"},
                {"Ferrari","Lamborghani","Alfa Remeo","Maserati"}
        };

        for (int i = 0; i <cars.length ; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println();

        for (String[] row : cars) {
            for (String car :row) {
                System.out.print(car+" ");

            }
            System.out.println();

        }
    }
}
