package class11;

public class E7D2Arrays {
    public static void main(String[] args) {

        boolean[][] arr2D = {
                {true, false, true, true, false},
                {true, false, false, false, false}


        };

        //with THE HELP OF loop counte how many times we have true in above 2Darray
        int counter = 0;


        for (boolean[] arr1D : arr2D) {
            for (boolean value : arr1D) {
                if (value == true) {
                    counter++;

                }

            }


        }
        System.out.println("counter = " + counter);
    }
}