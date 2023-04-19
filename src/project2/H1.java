package project2;
/*Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week.

 */
public class H1 {
    public static void main(String[] args) {
        int[] temOfW={31,32,30,33,34,35,34};
        //find the highest tem
        int highestTem=temOfW[0];
        int lowestTem=temOfW[0];
        for (int temp : temOfW) {
            if (temp>highestTem){
                highestTem=temp;
            }
            if (temp<lowestTem){
                lowestTem=temp;
            }

        }
        System.out.println("Highest temperature for the week is "+highestTem);
        System.out.println("Lowest temperature for the week is "+lowestTem);


    }
}
